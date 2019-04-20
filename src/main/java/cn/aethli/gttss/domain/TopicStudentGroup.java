package cn.aethli.gttss.domain;

import java.io.Serializable;
import java.util.Date;

public class TopicStudentGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.topicId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private String topicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.studentId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.batchId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private String batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.createDt
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private Date createDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.createBy
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicstudentgroup.status
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table topicstudentgroup
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.topicId
     *
     * @return the value of topicstudentgroup.topicId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.topicId
     *
     * @param topicId the value for topicstudentgroup.topicId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.studentId
     *
     * @return the value of topicstudentgroup.studentId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.studentId
     *
     * @param studentId the value for topicstudentgroup.studentId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.batchId
     *
     * @return the value of topicstudentgroup.batchId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.batchId
     *
     * @param batchId the value for topicstudentgroup.batchId
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.createDt
     *
     * @return the value of topicstudentgroup.createDt
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.createDt
     *
     * @param createDt the value for topicstudentgroup.createDt
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.createBy
     *
     * @return the value of topicstudentgroup.createBy
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.createBy
     *
     * @param createBy the value for topicstudentgroup.createBy
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicstudentgroup.status
     *
     * @return the value of topicstudentgroup.status
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicstudentgroup.status
     *
     * @param status the value for topicstudentgroup.status
     *
     * @mbg.generated Sat Apr 20 15:07:32 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}