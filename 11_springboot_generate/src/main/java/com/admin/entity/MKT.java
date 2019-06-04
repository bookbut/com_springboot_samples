package com.admin.entity;

public class MKT {
    /**
     * 
     */
    private Integer mktId;

    /**
     * 
     */
    private String mktName;

    /**
     * 图片地址
     */
    private String mktImg;

    /**
     * 
     */
    private String mktUrl;

    /**
     * 是否生效
     */
    private Integer mktStatus;

    /**
     * 
     * @return mkt_id 
     */
    public Integer getMktId() {
        return mktId;
    }

    /**
     * 
     * @param mktId 
     */
    public void setMktId(Integer mktId) {
        this.mktId = mktId;
    }

    /**
     * 
     * @return mkt_name 
     */
    public String getMktName() {
        return mktName;
    }

    /**
     * 
     * @param mktName 
     */
    public void setMktName(String mktName) {
        this.mktName = mktName == null ? null : mktName.trim();
    }

    /**
     * 图片地址
     * @return mkt_img 图片地址
     */
    public String getMktImg() {
        return mktImg;
    }

    /**
     * 图片地址
     * @param mktImg 图片地址
     */
    public void setMktImg(String mktImg) {
        this.mktImg = mktImg == null ? null : mktImg.trim();
    }

    /**
     * 
     * @return mkt_url 
     */
    public String getMktUrl() {
        return mktUrl;
    }

    /**
     * 
     * @param mktUrl 
     */
    public void setMktUrl(String mktUrl) {
        this.mktUrl = mktUrl == null ? null : mktUrl.trim();
    }

    /**
     * 是否生效
     * @return mkt_status 是否生效
     */
    public Integer getMktStatus() {
        return mktStatus;
    }

    /**
     * 是否生效
     * @param mktStatus 是否生效
     */
    public void setMktStatus(Integer mktStatus) {
        this.mktStatus = mktStatus;
    }
}