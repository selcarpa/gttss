package cn.aethli.gttss.domain;

import java.io.Serializable;

public class Major implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column major.Id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column major.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column major.Id
     *
     * @return the value of major.Id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column major.Id
     *
     * @param id the value for major.Id
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column major.name
     *
     * @return the value of major.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column major.name
     *
     * @param name the value for major.name
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}