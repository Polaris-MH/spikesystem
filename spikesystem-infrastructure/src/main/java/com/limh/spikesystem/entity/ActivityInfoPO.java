package com.limh.spikesystem.entity;

import java.io.Serializable;
import java.util.Date;

public class ActivityInfoPO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.price
     *
     * @mbg.generated
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.nums
     *
     * @mbg.generated
     */
    private Integer nums;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.deleted
     *
     * @mbg.generated
     */
    private Byte deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_activity_info.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.id
     *
     * @return the value of tb_activity_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.id
     *
     * @param id the value for tb_activity_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.product_id
     *
     * @return the value of tb_activity_info.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withProductId(Long productId) {
        this.setProductId(productId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.product_id
     *
     * @param productId the value for tb_activity_info.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.price
     *
     * @return the value of tb_activity_info.price
     *
     * @mbg.generated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withPrice(Integer price) {
        this.setPrice(price);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.price
     *
     * @param price the value for tb_activity_info.price
     *
     * @mbg.generated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.nums
     *
     * @return the value of tb_activity_info.nums
     *
     * @mbg.generated
     */
    public Integer getNums() {
        return nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withNums(Integer nums) {
        this.setNums(nums);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.nums
     *
     * @param nums the value for tb_activity_info.nums
     *
     * @mbg.generated
     */
    public void setNums(Integer nums) {
        this.nums = nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.start_time
     *
     * @return the value of tb_activity_info.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withStartTime(Date startTime) {
        this.setStartTime(startTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.start_time
     *
     * @param startTime the value for tb_activity_info.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.end_time
     *
     * @return the value of tb_activity_info.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withEndTime(Date endTime) {
        this.setEndTime(endTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.end_time
     *
     * @param endTime the value for tb_activity_info.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.deleted
     *
     * @return the value of tb_activity_info.deleted
     *
     * @mbg.generated
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withDeleted(Byte deleted) {
        this.setDeleted(deleted);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.deleted
     *
     * @param deleted the value for tb_activity_info.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.create_time
     *
     * @return the value of tb_activity_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.create_time
     *
     * @param createTime the value for tb_activity_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_activity_info.update_time
     *
     * @return the value of tb_activity_info.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    public ActivityInfoPO withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_activity_info.update_time
     *
     * @param updateTime the value for tb_activity_info.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_activity_info
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", price=").append(price);
        sb.append(", nums=").append(nums);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}