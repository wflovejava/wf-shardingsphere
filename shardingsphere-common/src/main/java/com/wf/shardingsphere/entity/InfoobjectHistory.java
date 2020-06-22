package com.wf.shardingsphere.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (InfoobjectHistory)实体类
 *
 * @author makejava
 * @since 2020-05-28 11:29:00
 */
public class InfoobjectHistory implements Serializable {
    private static final long serialVersionUID = 423462657112406330L;
    /**
    * 主键-递增
    */
    private Long id;
    /**
    * 信息对象id
    */
    private Long objectId;
    /**
    * 信息对象管理设备id
    */
    private String relationObjectId;
    /**
    * 属性id
    */
    private Long propertyId;
    /**
    * 属性名称
    */
    private String propertyName;
    /**
    * 属性编码
    */
    private String propertyCode;
    /**
    * 1:映射属性，2:计算属性
    */
    private Integer propertyType;
    /**
    * 值：格式json
    */
    private String value;
    
    private String storeRule;
    /**
    * 设备采集时间
    */
    private Date deviceTime;
    /**
    * 网关上报时间
    */
    private Date uploadedTime;
    /**
    * 入库时间
    */
    private Date createTime;
    /**
    * 分组时间 iot分组用
    */
    private String groupTime;
    /**
    * 录入人
    */
    private String keyboarder;
    /**
    * 录入方式（自动/手动）
    */
    private String enteringType;
    /**
    * 0-有效，1-无效
    */
    private Integer dataValid;
    /**
    * iot设备id
    */
    private String deviceName;
    /**
    * 结算查询标记
    */
    private Integer settleAccountFlag;
    /**
    * 租户Id
    */
    private Long tenantId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getRelationObjectId() {
        return relationObjectId;
    }

    public void setRelationObjectId(String relationObjectId) {
        this.relationObjectId = relationObjectId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public Integer getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStoreRule() {
        return storeRule;
    }

    public void setStoreRule(String storeRule) {
        this.storeRule = storeRule;
    }

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Date getUploadedTime() {
        return uploadedTime;
    }

    public void setUploadedTime(Date uploadedTime) {
        this.uploadedTime = uploadedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGroupTime() {
        return groupTime;
    }

    public void setGroupTime(String groupTime) {
        this.groupTime = groupTime;
    }

    public String getKeyboarder() {
        return keyboarder;
    }

    public void setKeyboarder(String keyboarder) {
        this.keyboarder = keyboarder;
    }

    public String getEnteringType() {
        return enteringType;
    }

    public void setEnteringType(String enteringType) {
        this.enteringType = enteringType;
    }

    public Integer getDataValid() {
        return dataValid;
    }

    public void setDataValid(Integer dataValid) {
        this.dataValid = dataValid;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Integer getSettleAccountFlag() {
        return settleAccountFlag;
    }

    public void setSettleAccountFlag(Integer settleAccountFlag) {
        this.settleAccountFlag = settleAccountFlag;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

}