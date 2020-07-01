package com.holybell;

import com.google.common.collect.Maps;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 本类需要修改IDEA的编译器参数，-parameters，否则无法反射获取到参数名称
 */

interface UserMapper {
    @Select("select * from user where id=#{id} and name=#{name}")
    List<Object> selectUserList(Integer id, String name);
}

public class ProxyTest {

    public static void main(String[] args) {

        UserMapper userMapper = (UserMapper) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), new Class<?>[]{UserMapper.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Select annotation = method.getAnnotation(Select.class);
                // 构建参数和参数值的映射关系
                Map<String, Object> nameArgMap = buildMethodArgNameMap(method, args);
                if (annotation != null) {
                    String[] value = annotation.value();
                    String sql = value[0];
                    // 解析得到可以运行的SQL
                    sql = parseSQL(sql, nameArgMap);
                    // 这里就可以执行JDBC数据库操作了
                    System.out.println(sql);
                    // 获取返回类型
                    System.out.println(method.getReturnType());
                    // 获取返回类型中的泛型
                    System.out.println(method.getGenericReturnType());
                }
                return null;
            }
        });

        userMapper.selectUserList(1, "test");
    }

    /**
     * 解析SQL语句，即替换占位符
     *
     * @param sql        原生SQL语句，包含占位符
     * @param nameArgMap 方法的参数名称和参数值集合
     * @return 解析完毕可以执行的SQL
     */
    public static String parseSQL(String sql, Map<String, Object> nameArgMap) {
        StringBuilder parseSQL = new StringBuilder();
        for (int i = 0; i < sql.length(); i++) {
            char c = sql.charAt(i);
            // 遍历到#表示要替换后面的参数
            if (c == '#') {
                // 取下一个下标，获得左括号{
                int nextIndex = i + 1;
                char nextChar = sql.charAt(nextIndex);
                if (nextChar != '{') {
                    throw new RuntimeException(String.format("这里应该为#{\nsql:%s\nindex:%d", parseSQL.toString(), nextIndex));
                }
                // 解析占位符的名称，从nameArgMap获取值填充到SQL中
                StringBuilder argSB = new StringBuilder();
                // 解析完毕占位符，返回又括号}的位置，交给for自增，进入下一个字符
                i = parseSQLArg(argSB, sql, nextIndex);
                String argName = argSB.toString();
                Object argValue = nameArgMap.get(argName);
                if (argValue == null) {
                    throw new RuntimeException(String.format("找不到参数值sql:%s", argName));
                }
                parseSQL.append(argValue.toString());
                continue;
            }
            parseSQL.append(c);
        }
        return parseSQL.toString();
    }

    /**
     * 解析SQL中的参数名称
     *
     * @param argSB     用来获取解析得到的占位符名称
     * @param sql       原生SQL
     * @param nextIndex 左括号{的下标
     * @return 有括号}的下标
     */
    private static int parseSQLArg(StringBuilder argSB, String sql, int nextIndex) {
        nextIndex++;    // 后进一位到{之后
        for (int i = nextIndex; i < sql.length(); i++) {
            char c = sql.charAt(i);
            if (c != '}') {
                argSB.append(c);
                continue;
            }
            if (c == '}') {
                return i;
            }
        }
        throw new RuntimeException(String.format("缺少右括号\nindex:%d", nextIndex));
    }

    public static Map<String, Object> buildMethodArgNameMap(Method method, Object[] args) {
        Map<String, Object> nameArgMap = Maps.newHashMap();
        Parameter[] parameters = method.getParameters();        // 这里需要修改编译器参数
        int index[] = {0};
        Arrays.asList(parameters).forEach(parameter -> {
            String name = parameter.getName();
            nameArgMap.put(name, args[index[0]]);
            index[0]++;
        });
        return nameArgMap;
    }
}
