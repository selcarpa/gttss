package cn.aethli.gttss.domain;

import java.io.Serializable;

public class ClassName implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classname.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classname.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classname.repeatIndex
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private Integer repeatIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table classname
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classname.id
     *
     * @return the value of classname.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classname.id
     *
     * @param id the value for classname.id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classname.name
     *
     * @return the value of classname.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classname.name
     *
     * @param name the value for classname.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classname.repeatIndex
     *
     * @return the value of classname.repeatIndex
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public Integer getRepeatIndex() {
        return repeatIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classname.repeatIndex
     *
     * @param repeatIndex the value for classname.repeatIndex
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setRepeatIndex(Integer repeatIndex) {
        this.repeatIndex = repeatIndex;
    }
}