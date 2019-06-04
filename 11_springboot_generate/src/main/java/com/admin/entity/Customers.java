package com.admin.entity;

public class Customers {
    /**
     * 
     */
    private Integer custId;

    /**
     * 哪个用户的客户，对应users
     */
    private Integer userId;

    /**
     * 
     */
    private String custName;

    /**
     * 
     */
    private String custPhone;

    /**
     * 
     */
    private String custEmail;

    /**
     * 职业
     */
    private String custJob;

    /**
     * 贷款额度:元
     */
    private Integer custCredit;

    /**
     * 
     * @return cust_id 
     */
    public Integer getCustId() {
        return custId;
    }

    /**
     * 
     * @param custId 
     */
    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    /**
     * 哪个用户的客户，对应users
     * @return user_id 哪个用户的客户，对应users
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 哪个用户的客户，对应users
     * @param userId 哪个用户的客户，对应users
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return cust_name 
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 
     * @param custName 
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 
     * @return cust_phone 
     */
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * 
     * @param custPhone 
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    /**
     * 
     * @return cust_email 
     */
    public String getCustEmail() {
        return custEmail;
    }

    /**
     * 
     * @param custEmail 
     */
    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    /**
     * 职业
     * @return cust_job 职业
     */
    public String getCustJob() {
        return custJob;
    }

    /**
     * 职业
     * @param custJob 职业
     */
    public void setCustJob(String custJob) {
        this.custJob = custJob == null ? null : custJob.trim();
    }

    /**
     * 贷款额度:元
     * @return cust_credit 贷款额度:元
     */
    public Integer getCustCredit() {
        return custCredit;
    }

    /**
     * 贷款额度:元
     * @param custCredit 贷款额度:元
     */
    public void setCustCredit(Integer custCredit) {
        this.custCredit = custCredit;
    }
}