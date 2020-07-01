package com.holybell.mybatis.generator.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExpressOrder {
    private Integer id;

    private Integer partnerId;

    private Integer cityId;

    private String cityName;

    private String orderNo;

    private String billNo;

    private BigDecimal weight;

    private BigDecimal adjustWeight;

    private String openId;

    private String unionId;

    private String identityNo;

    private Integer userId;

    private String senderName;

    private String senderMobile;

    private String senderProv;

    private String senderCity;

    private String senderCounty;

    private String senderAddress;

    private String receiverName;

    private String receiverMobile;

    private String receiverProv;

    private String receiverCity;

    private String receiverCounty;

    private String receiverAddress;

    private String originalExpressNo;

    private Date firstArriveTime;

    private Date createTime;

    private Date recTime;

    private Date signTime;

    private Integer couponId;

    private Byte couponType;

    private BigDecimal discount;

    private String cargoType;

    private Boolean isReturn;

    private Boolean isPay;

    private BigDecimal initFee;

    private BigDecimal paidFee;

    private BigDecimal repayFee;

    private BigDecimal finalFee;

    private BigDecimal finalPaidFee;

    private Boolean isRepay;

    private Boolean status;

    private String img1;

    private String img2;

    private String img3;

    private String remark;

    private String remark2;

    private Boolean isMembership;

    private String cancelReason;

    private Integer urgeTime;

    private Integer shanghuId;

    private Byte canCommission;

    private Integer agentShanghuId;

    private Byte isArrive;

    private String arriveImgUrl;

    public ExpressOrder(Integer id, Integer partnerId, Integer cityId, String cityName, String orderNo, String billNo, BigDecimal weight, BigDecimal adjustWeight, String openId, String unionId, String identityNo, Integer userId, String senderName, String senderMobile, String senderProv, String senderCity, String senderCounty, String senderAddress, String receiverName, String receiverMobile, String receiverProv, String receiverCity, String receiverCounty, String receiverAddress, String originalExpressNo, Date firstArriveTime, Date createTime, Date recTime, Date signTime, Integer couponId, Byte couponType, BigDecimal discount, String cargoType, Boolean isReturn, Boolean isPay, BigDecimal initFee, BigDecimal paidFee, BigDecimal repayFee, BigDecimal finalFee, BigDecimal finalPaidFee, Boolean isRepay, Boolean status, String img1, String img2, String img3, String remark, String remark2, Boolean isMembership, String cancelReason, Integer urgeTime, Integer shanghuId, Byte canCommission, Integer agentShanghuId, Byte isArrive, String arriveImgUrl) {
        this.id = id;
        this.partnerId = partnerId;
        this.cityId = cityId;
        this.cityName = cityName;
        this.orderNo = orderNo;
        this.billNo = billNo;
        this.weight = weight;
        this.adjustWeight = adjustWeight;
        this.openId = openId;
        this.unionId = unionId;
        this.identityNo = identityNo;
        this.userId = userId;
        this.senderName = senderName;
        this.senderMobile = senderMobile;
        this.senderProv = senderProv;
        this.senderCity = senderCity;
        this.senderCounty = senderCounty;
        this.senderAddress = senderAddress;
        this.receiverName = receiverName;
        this.receiverMobile = receiverMobile;
        this.receiverProv = receiverProv;
        this.receiverCity = receiverCity;
        this.receiverCounty = receiverCounty;
        this.receiverAddress = receiverAddress;
        this.originalExpressNo = originalExpressNo;
        this.firstArriveTime = firstArriveTime;
        this.createTime = createTime;
        this.recTime = recTime;
        this.signTime = signTime;
        this.couponId = couponId;
        this.couponType = couponType;
        this.discount = discount;
        this.cargoType = cargoType;
        this.isReturn = isReturn;
        this.isPay = isPay;
        this.initFee = initFee;
        this.paidFee = paidFee;
        this.repayFee = repayFee;
        this.finalFee = finalFee;
        this.finalPaidFee = finalPaidFee;
        this.isRepay = isRepay;
        this.status = status;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.remark = remark;
        this.remark2 = remark2;
        this.isMembership = isMembership;
        this.cancelReason = cancelReason;
        this.urgeTime = urgeTime;
        this.shanghuId = shanghuId;
        this.canCommission = canCommission;
        this.agentShanghuId = agentShanghuId;
        this.isArrive = isArrive;
        this.arriveImgUrl = arriveImgUrl;
    }

    public ExpressOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getAdjustWeight() {
        return adjustWeight;
    }

    public void setAdjustWeight(BigDecimal adjustWeight) {
        this.adjustWeight = adjustWeight;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile == null ? null : senderMobile.trim();
    }

    public String getSenderProv() {
        return senderProv;
    }

    public void setSenderProv(String senderProv) {
        this.senderProv = senderProv == null ? null : senderProv.trim();
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity == null ? null : senderCity.trim();
    }

    public String getSenderCounty() {
        return senderCounty;
    }

    public void setSenderCounty(String senderCounty) {
        this.senderCounty = senderCounty == null ? null : senderCounty.trim();
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress == null ? null : senderAddress.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverProv() {
        return receiverProv;
    }

    public void setReceiverProv(String receiverProv) {
        this.receiverProv = receiverProv == null ? null : receiverProv.trim();
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity == null ? null : receiverCity.trim();
    }

    public String getReceiverCounty() {
        return receiverCounty;
    }

    public void setReceiverCounty(String receiverCounty) {
        this.receiverCounty = receiverCounty == null ? null : receiverCounty.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getOriginalExpressNo() {
        return originalExpressNo;
    }

    public void setOriginalExpressNo(String originalExpressNo) {
        this.originalExpressNo = originalExpressNo == null ? null : originalExpressNo.trim();
    }

    public Date getFirstArriveTime() {
        return firstArriveTime;
    }

    public void setFirstArriveTime(Date firstArriveTime) {
        this.firstArriveTime = firstArriveTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRecTime() {
        return recTime;
    }

    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType == null ? null : cargoType.trim();
    }

    public Boolean getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(Boolean isReturn) {
        this.isReturn = isReturn;
    }

    public Boolean getIsPay() {
        return isPay;
    }

    public void setIsPay(Boolean isPay) {
        this.isPay = isPay;
    }

    public BigDecimal getInitFee() {
        return initFee;
    }

    public void setInitFee(BigDecimal initFee) {
        this.initFee = initFee;
    }

    public BigDecimal getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(BigDecimal paidFee) {
        this.paidFee = paidFee;
    }

    public BigDecimal getRepayFee() {
        return repayFee;
    }

    public void setRepayFee(BigDecimal repayFee) {
        this.repayFee = repayFee;
    }

    public BigDecimal getFinalFee() {
        return finalFee;
    }

    public void setFinalFee(BigDecimal finalFee) {
        this.finalFee = finalFee;
    }

    public BigDecimal getFinalPaidFee() {
        return finalPaidFee;
    }

    public void setFinalPaidFee(BigDecimal finalPaidFee) {
        this.finalPaidFee = finalPaidFee;
    }

    public Boolean getIsRepay() {
        return isRepay;
    }

    public void setIsRepay(Boolean isRepay) {
        this.isRepay = isRepay;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public Boolean getIsMembership() {
        return isMembership;
    }

    public void setIsMembership(Boolean isMembership) {
        this.isMembership = isMembership;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    public Integer getUrgeTime() {
        return urgeTime;
    }

    public void setUrgeTime(Integer urgeTime) {
        this.urgeTime = urgeTime;
    }

    public Integer getShanghuId() {
        return shanghuId;
    }

    public void setShanghuId(Integer shanghuId) {
        this.shanghuId = shanghuId;
    }

    public Byte getCanCommission() {
        return canCommission;
    }

    public void setCanCommission(Byte canCommission) {
        this.canCommission = canCommission;
    }

    public Integer getAgentShanghuId() {
        return agentShanghuId;
    }

    public void setAgentShanghuId(Integer agentShanghuId) {
        this.agentShanghuId = agentShanghuId;
    }

    public Byte getIsArrive() {
        return isArrive;
    }

    public void setIsArrive(Byte isArrive) {
        this.isArrive = isArrive;
    }

    public String getArriveImgUrl() {
        return arriveImgUrl;
    }

    public void setArriveImgUrl(String arriveImgUrl) {
        this.arriveImgUrl = arriveImgUrl == null ? null : arriveImgUrl.trim();
    }
}