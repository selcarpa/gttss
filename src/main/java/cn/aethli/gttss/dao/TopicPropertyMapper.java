package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.TopicProperty;
import org.springframework.stereotype.Component;

@Component
public interface TopicPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topicproperty
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insert(TopicProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topicproperty
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insertSelective(TopicProperty record);
}