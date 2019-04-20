package cn.aethli.gttss.domain;

import java.io.Serializable;
import java.util.Date;

public class Topic implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.name
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.teacherId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.selectStatus
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private Integer selectStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.needStudent
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private Integer needStudent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.sourceId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.typeId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.teacher2Id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String teacher2Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.propertyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String propertyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.compare
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private Integer compare;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.planLinkKey
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String planLinkKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.teacherVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String teacherVerifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.adminVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String adminVerifyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.createDt
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private Date createDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.createBy
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.validityBatch
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String validityBatch;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic.originId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private String originId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table topic
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.id
     *
     * @return the value of topic.id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.id
     *
     * @param id the value for topic.id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.name
     *
     * @return the value of topic.name
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.name
     *
     * @param name the value for topic.name
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.teacherId
     *
     * @return the value of topic.teacherId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.teacherId
     *
     * @param teacherId the value for topic.teacherId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.selectStatus
     *
     * @return the value of topic.selectStatus
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public Integer getSelectStatus() {
        return selectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.selectStatus
     *
     * @param selectStatus the value for topic.selectStatus
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setSelectStatus(Integer selectStatus) {
        this.selectStatus = selectStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.needStudent
     *
     * @return the value of topic.needStudent
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public Integer getNeedStudent() {
        return needStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.needStudent
     *
     * @param needStudent the value for topic.needStudent
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setNeedStudent(Integer needStudent) {
        this.needStudent = needStudent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.sourceId
     *
     * @return the value of topic.sourceId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.sourceId
     *
     * @param sourceId the value for topic.sourceId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.typeId
     *
     * @return the value of topic.typeId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.typeId
     *
     * @param typeId the value for topic.typeId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.teacher2Id
     *
     * @return the value of topic.teacher2Id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getTeacher2Id() {
        return teacher2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.teacher2Id
     *
     * @param teacher2Id the value for topic.teacher2Id
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setTeacher2Id(String teacher2Id) {
        this.teacher2Id = teacher2Id == null ? null : teacher2Id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.propertyId
     *
     * @return the value of topic.propertyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getPropertyId() {
        return propertyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.propertyId
     *
     * @param propertyId the value for topic.propertyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId == null ? null : propertyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.compare
     *
     * @return the value of topic.compare
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public Integer getCompare() {
        return compare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.compare
     *
     * @param compare the value for topic.compare
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setCompare(Integer compare) {
        this.compare = compare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.planLinkKey
     *
     * @return the value of topic.planLinkKey
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getPlanLinkKey() {
        return planLinkKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.planLinkKey
     *
     * @param planLinkKey the value for topic.planLinkKey
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setPlanLinkKey(String planLinkKey) {
        this.planLinkKey = planLinkKey == null ? null : planLinkKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.teacherVerifyId
     *
     * @return the value of topic.teacherVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getTeacherVerifyId() {
        return teacherVerifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.teacherVerifyId
     *
     * @param teacherVerifyId the value for topic.teacherVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setTeacherVerifyId(String teacherVerifyId) {
        this.teacherVerifyId = teacherVerifyId == null ? null : teacherVerifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.adminVerifyId
     *
     * @return the value of topic.adminVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getAdminVerifyId() {
        return adminVerifyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.adminVerifyId
     *
     * @param adminVerifyId the value for topic.adminVerifyId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setAdminVerifyId(String adminVerifyId) {
        this.adminVerifyId = adminVerifyId == null ? null : adminVerifyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.createDt
     *
     * @return the value of topic.createDt
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public Date getCreateDt() {
        return createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.createDt
     *
     * @param createDt the value for topic.createDt
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.createBy
     *
     * @return the value of topic.createBy
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.createBy
     *
     * @param createBy the value for topic.createBy
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.validityBatch
     *
     * @return the value of topic.validityBatch
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getValidityBatch() {
        return validityBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.validityBatch
     *
     * @param validityBatch the value for topic.validityBatch
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setValidityBatch(String validityBatch) {
        this.validityBatch = validityBatch == null ? null : validityBatch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic.originId
     *
     * @return the value of topic.originId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic.originId
     *
     * @param originId the value for topic.originId
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    public void setOriginId(String originId) {
        this.originId = originId == null ? null : originId.trim();
    }
}