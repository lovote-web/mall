package com.lovoteweb.mallproject.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class ProComment implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.id
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.member_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private String memberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.product_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.star
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.create_time
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.show_status
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.collect_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer collectCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.read_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer readCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.pics
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private String pics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.member_icon
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private String memberIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.replay_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private Integer replayCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pro_comment.count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private String count;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.id
     *
     * @return the value of pro_comment.id
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.id
     *
     * @param id the value for pro_comment.id
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.member_name
     *
     * @return the value of pro_comment.member_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.member_name
     *
     * @param memberName the value for pro_comment.member_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.product_name
     *
     * @return the value of pro_comment.product_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.product_name
     *
     * @param productName the value for pro_comment.product_name
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setProductName(Integer productName) {
        this.productName = productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.star
     *
     * @return the value of pro_comment.star
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.star
     *
     * @param star the value for pro_comment.star
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setStar(Integer star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.create_time
     *
     * @return the value of pro_comment.create_time
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.create_time
     *
     * @param createTime the value for pro_comment.create_time
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.show_status
     *
     * @return the value of pro_comment.show_status
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.show_status
     *
     * @param showStatus the value for pro_comment.show_status
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.collect_count
     *
     * @return the value of pro_comment.collect_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getCollectCount() {
        return collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.collect_count
     *
     * @param collectCount the value for pro_comment.collect_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.read_count
     *
     * @return the value of pro_comment.read_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.read_count
     *
     * @param readCount the value for pro_comment.read_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.pics
     *
     * @return the value of pro_comment.pics
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public String getPics() {
        return pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.pics
     *
     * @param pics the value for pro_comment.pics
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setPics(String pics) {
        this.pics = pics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.member_icon
     *
     * @return the value of pro_comment.member_icon
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public String getMemberIcon() {
        return memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.member_icon
     *
     * @param memberIcon the value for pro_comment.member_icon
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.replay_count
     *
     * @return the value of pro_comment.replay_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public Integer getReplayCount() {
        return replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.replay_count
     *
     * @param replayCount the value for pro_comment.replay_count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pro_comment.count
     *
     * @return the value of pro_comment.count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public String getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pro_comment.count
     *
     * @param count the value for pro_comment.count
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberName=").append(memberName);
        sb.append(", productName=").append(productName);
        sb.append(", star=").append(star);
        sb.append(", createTime=").append(createTime);
        sb.append(", showStatus=").append(showStatus);
        sb.append(", collectCount=").append(collectCount);
        sb.append(", readCount=").append(readCount);
        sb.append(", pics=").append(pics);
        sb.append(", memberIcon=").append(memberIcon);
        sb.append(", replayCount=").append(replayCount);
        sb.append(", count=").append(count);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}