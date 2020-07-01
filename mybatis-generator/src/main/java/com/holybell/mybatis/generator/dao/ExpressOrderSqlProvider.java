package com.holybell.mybatis.generator.dao;

import com.holybell.mybatis.generator.entity.ExpressOrder;
import org.apache.ibatis.jdbc.SQL;

public class ExpressOrderSqlProvider {

    public String insertSelective(ExpressOrder record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("express_order");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPartnerId() != null) {
            sql.VALUES("partner_id", "#{partnerId,jdbcType=INTEGER}");
        }
        
        if (record.getCityId() != null) {
            sql.VALUES("city_id", "#{cityId,jdbcType=INTEGER}");
        }
        
        if (record.getCityName() != null) {
            sql.VALUES("city_name", "#{cityName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBillNo() != null) {
            sql.VALUES("bill_no", "#{billNo,jdbcType=VARCHAR}");
        }
        
        if (record.getWeight() != null) {
            sql.VALUES("weight", "#{weight,jdbcType=DECIMAL}");
        }
        
        if (record.getAdjustWeight() != null) {
            sql.VALUES("adjust_weight", "#{adjustWeight,jdbcType=DECIMAL}");
        }
        
        if (record.getOpenId() != null) {
            sql.VALUES("open_id", "#{openId,jdbcType=VARCHAR}");
        }
        
        if (record.getUnionId() != null) {
            sql.VALUES("union_id", "#{unionId,jdbcType=VARCHAR}");
        }
        
        if (record.getIdentityNo() != null) {
            sql.VALUES("identity_no", "#{identityNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getSenderName() != null) {
            sql.VALUES("sender_name", "#{senderName,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderMobile() != null) {
            sql.VALUES("sender_mobile", "#{senderMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderProv() != null) {
            sql.VALUES("sender_prov", "#{senderProv,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderCity() != null) {
            sql.VALUES("sender_city", "#{senderCity,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderCounty() != null) {
            sql.VALUES("sender_county", "#{senderCounty,jdbcType=VARCHAR}");
        }
        
        if (record.getSenderAddress() != null) {
            sql.VALUES("sender_address", "#{senderAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverName() != null) {
            sql.VALUES("receiver_name", "#{receiverName,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverMobile() != null) {
            sql.VALUES("receiver_mobile", "#{receiverMobile,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverProv() != null) {
            sql.VALUES("receiver_prov", "#{receiverProv,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverCity() != null) {
            sql.VALUES("receiver_city", "#{receiverCity,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverCounty() != null) {
            sql.VALUES("receiver_county", "#{receiverCounty,jdbcType=VARCHAR}");
        }
        
        if (record.getReceiverAddress() != null) {
            sql.VALUES("receiver_address", "#{receiverAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getOriginalExpressNo() != null) {
            sql.VALUES("original_express_no", "#{originalExpressNo,jdbcType=VARCHAR}");
        }
        
        if (record.getFirstArriveTime() != null) {
            sql.VALUES("first_arrive_time", "#{firstArriveTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRecTime() != null) {
            sql.VALUES("rec_time", "#{recTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSignTime() != null) {
            sql.VALUES("sign_time", "#{signTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCouponId() != null) {
            sql.VALUES("coupon_id", "#{couponId,jdbcType=INTEGER}");
        }
        
        if (record.getCouponType() != null) {
            sql.VALUES("coupon_type", "#{couponType,jdbcType=TINYINT}");
        }
        
        if (record.getDiscount() != null) {
            sql.VALUES("discount", "#{discount,jdbcType=DECIMAL}");
        }
        
        if (record.getCargoType() != null) {
            sql.VALUES("cargo_type", "#{cargoType,jdbcType=VARCHAR}");
        }
        
        if (record.getIsReturn() != null) {
            sql.VALUES("is_return", "#{isReturn,jdbcType=BIT}");
        }
        
        if (record.getIsPay() != null) {
            sql.VALUES("is_pay", "#{isPay,jdbcType=BIT}");
        }
        
        if (record.getInitFee() != null) {
            sql.VALUES("init_fee", "#{initFee,jdbcType=DECIMAL}");
        }
        
        if (record.getPaidFee() != null) {
            sql.VALUES("paid_fee", "#{paidFee,jdbcType=DECIMAL}");
        }
        
        if (record.getRepayFee() != null) {
            sql.VALUES("repay_fee", "#{repayFee,jdbcType=DECIMAL}");
        }
        
        if (record.getFinalFee() != null) {
            sql.VALUES("final_fee", "#{finalFee,jdbcType=DECIMAL}");
        }
        
        if (record.getFinalPaidFee() != null) {
            sql.VALUES("final_paid_fee", "#{finalPaidFee,jdbcType=DECIMAL}");
        }
        
        if (record.getIsRepay() != null) {
            sql.VALUES("is_repay", "#{isRepay,jdbcType=BIT}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=BIT}");
        }
        
        if (record.getImg1() != null) {
            sql.VALUES("img1", "#{img1,jdbcType=VARCHAR}");
        }
        
        if (record.getImg2() != null) {
            sql.VALUES("img2", "#{img2,jdbcType=VARCHAR}");
        }
        
        if (record.getImg3() != null) {
            sql.VALUES("img3", "#{img3,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark2() != null) {
            sql.VALUES("remark2", "#{remark2,jdbcType=VARCHAR}");
        }
        
        if (record.getIsMembership() != null) {
            sql.VALUES("is_membership", "#{isMembership,jdbcType=BIT}");
        }
        
        if (record.getCancelReason() != null) {
            sql.VALUES("cancel_reason", "#{cancelReason,jdbcType=VARCHAR}");
        }
        
        if (record.getUrgeTime() != null) {
            sql.VALUES("urge_time", "#{urgeTime,jdbcType=INTEGER}");
        }
        
        if (record.getShanghuId() != null) {
            sql.VALUES("shanghu_id", "#{shanghuId,jdbcType=INTEGER}");
        }
        
        if (record.getCanCommission() != null) {
            sql.VALUES("can_commission", "#{canCommission,jdbcType=TINYINT}");
        }
        
        if (record.getAgentShanghuId() != null) {
            sql.VALUES("agent_shanghu_id", "#{agentShanghuId,jdbcType=INTEGER}");
        }
        
        if (record.getIsArrive() != null) {
            sql.VALUES("is_arrive", "#{isArrive,jdbcType=TINYINT}");
        }
        
        if (record.getArriveImgUrl() != null) {
            sql.VALUES("arrive_img_url", "#{arriveImgUrl,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}