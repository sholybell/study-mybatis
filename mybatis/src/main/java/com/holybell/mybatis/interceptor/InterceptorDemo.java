package com.holybell.mybatis.interceptor;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

interface Interceptor {

    Object plugin(Object target, InterceptionChain chain);

    Object plugin(Object target);

}

class InterceptorA implements Interceptor {

    @Override
    public Object plugin(Object target, InterceptionChain chain) {
        System.out.println("InterceptorA");
        return chain.plugin(target);
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("InterceptorA");
        return target;
    }
}

class InterceptorB implements Interceptor {

    @Override
    public Object plugin(Object target, InterceptionChain chain) {
        System.out.println("InterceptorB");
        return target;
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("InterceptorB");
        return target;
    }
}

class InterceptorC implements Interceptor {

    @Override
    public Object plugin(Object target, InterceptionChain chain) {
        System.out.println("InterceptorC");
        return target;
    }

    @Override
    public Object plugin(Object target) {
        System.out.println("InterceptorC");
        return target;
    }
}

class InterceptionChain {
    private List<Interceptor> interceptorList = Lists.newArrayList();
    private Iterator<Interceptor> interceptorIterator;

    public void addInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
    }

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptorList) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    public Object plugin(Object target) {
        if (interceptorIterator == null) {
            interceptorIterator = interceptorList.iterator();
        }
        if (interceptorIterator.hasNext()) {
            Interceptor next = interceptorIterator.next();
            next.plugin(target, this);
        }
        return target;
    }
}


public class InterceptorDemo {

    public static void main(String[] args) {
        InterceptorA interceptorA = new InterceptorA();
        InterceptorB interceptorB = new InterceptorB();
        InterceptorC interceptorC = new InterceptorC();
        InterceptionChain interceptionChain = new InterceptionChain();
        interceptionChain.addInterceptor(interceptorA);
        interceptionChain.addInterceptor(interceptorB);
        interceptionChain.addInterceptor(interceptorC);
        // 这种方式会调用所有的拦截器
        interceptionChain.pluginAll(new Object());
        // 这种方式可以由拦截器定义是否往下传递
        interceptionChain.plugin(new Object());
    }
}
