package cn.aethli.gttss.domain;

import java.io.Serializable;

public class TopicOrigin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicorigin.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicorigin.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topicorigin.remarks
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table topicorigin
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicorigin.id
     *
     * @return the value of topicorigin.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicorigin.id
     *
     * @param id the value for topicorigin.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicorigin.name
     *
     * @return the value of topicorigin.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicorigin.name
     *
     * @param name the value for topicorigin.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topicorigin.remarks
     *
     * @return the value of topicorigin.remarks
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topicorigin.remarks
     *
     * @param remarks the value for topicorigin.remarks
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}