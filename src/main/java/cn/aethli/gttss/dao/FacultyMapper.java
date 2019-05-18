package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.Faculty;
import cn.aethli.gttss.domain.Student;
import org.springframework.stereotype.Component;

@Component
public interface FacultyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faculty
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insert(Faculty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table faculty
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insertSelective(Faculty record);

    Faculty selectById(Faculty faculty);
}