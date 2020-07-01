package com.holybell.mybatis.generator.dao;

import com.holybell.mybatis.generator.entity.ExpressOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;

public interface ExpressOrderMapper {
    @Insert({
        "insert into express_order (id, partner_id, ",
        "city_id, city_name, ",
        "order_no, bill_no, ",
        "weight, adjust_weight, ",
        "open_id, union_id, ",
        "identity_no, user_id, ",
        "sender_name, sender_mobile, ",
        "sender_prov, sender_city, ",
        "sender_county, sender_address, ",
        "receiver_name, receiver_mobile, ",
        "receiver_prov, receiver_city, ",
        "receiver_county, receiver_address, ",
        "original_express_no, first_arrive_time, ",
        "create_time, rec_time, ",
        "sign_time, coupon_id, ",
        "coupon_type, discount, ",
        "cargo_type, is_return, ",
        "is_pay, init_fee, paid_fee, ",
        "repay_fee, final_fee, ",
        "final_paid_fee, is_repay, ",
        "status, img1, img2, ",
        "img3, remark, remark2, ",
        "is_membership, cancel_reason, ",
        "urge_time, shanghu_id, ",
        "can_commission, agent_shanghu_id, ",
        "is_arrive, arrive_img_url)",
        "values (#{id,jdbcType=INTEGER}, #{partnerId,jdbcType=INTEGER}, ",
        "#{cityId,jdbcType=INTEGER}, #{cityName,jdbcType=VARCHAR}, ",
        "#{orderNo,jdbcType=VARCHAR}, #{billNo,jdbcType=VARCHAR}, ",
        "#{weight,jdbcType=DECIMAL}, #{adjustWeight,jdbcType=DECIMAL}, ",
        "#{openId,jdbcType=VARCHAR}, #{unionId,jdbcType=VARCHAR}, ",
        "#{identityNo,jdbcType=VARCHAR}, #{userId,jdbcType=INTEGER}, ",
        "#{senderName,jdbcType=VARCHAR}, #{senderMobile,jdbcType=VARCHAR}, ",
        "#{senderProv,jdbcType=VARCHAR}, #{senderCity,jdbcType=VARCHAR}, ",
        "#{senderCounty,jdbcType=VARCHAR}, #{senderAddress,jdbcType=VARCHAR}, ",
        "#{receiverName,jdbcType=VARCHAR}, #{receiverMobile,jdbcType=VARCHAR}, ",
        "#{receiverProv,jdbcType=VARCHAR}, #{receiverCity,jdbcType=VARCHAR}, ",
        "#{receiverCounty,jdbcType=VARCHAR}, #{receiverAddress,jdbcType=VARCHAR}, ",
        "#{originalExpressNo,jdbcType=VARCHAR}, #{firstArriveTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{recTime,jdbcType=TIMESTAMP}, ",
        "#{signTime,jdbcType=TIMESTAMP}, #{couponId,jdbcType=INTEGER}, ",
        "#{couponType,jdbcType=TINYINT}, #{discount,jdbcType=DECIMAL}, ",
        "#{cargoType,jdbcType=VARCHAR}, #{isReturn,jdbcType=BIT}, ",
        "#{isPay,jdbcType=BIT}, #{initFee,jdbcType=DECIMAL}, #{paidFee,jdbcType=DECIMAL}, ",
        "#{repayFee,jdbcType=DECIMAL}, #{finalFee,jdbcType=DECIMAL}, ",
        "#{finalPaidFee,jdbcType=DECIMAL}, #{isRepay,jdbcType=BIT}, ",
        "#{status,jdbcType=BIT}, #{img1,jdbcType=VARCHAR}, #{img2,jdbcType=VARCHAR}, ",
        "#{img3,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, #{remark2,jdbcType=VARCHAR}, ",
        "#{isMembership,jdbcType=BIT}, #{cancelReason,jdbcType=VARCHAR}, ",
        "#{urgeTime,jdbcType=INTEGER}, #{shanghuId,jdbcType=INTEGER}, ",
        "#{canCommission,jdbcType=TINYINT}, #{agentShanghuId,jdbcType=INTEGER}, ",
        "#{isArrive,jdbcType=TINYINT}, #{arriveImgUrl,jdbcType=VARCHAR})"
    })
    int insert(ExpressOrder record);

    @InsertProvider(type=ExpressOrderSqlProvider.class, method="insertSelective")
    int insertSelective(ExpressOrder record);
}