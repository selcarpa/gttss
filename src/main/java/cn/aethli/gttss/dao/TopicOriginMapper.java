package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.TopicOrigin;
import org.springframework.stereotype.Component;

@Component
public interface TopicOriginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topicorigin
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insert(TopicOrigin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topicorigin
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insertSelective(TopicOrigin record);
}