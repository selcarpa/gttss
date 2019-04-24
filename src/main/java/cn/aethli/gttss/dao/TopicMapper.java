package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.Topic;
import cn.aethli.gttss.domain.TopicWithBLOBs;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    int insert(TopicWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbg.generated Sat Apr 20 15:35:17 CST 2019
     */
    int insertSelective(TopicWithBLOBs record);

    List<Topic> selectByBatchId(Map<String, Object> queryMap);

    Topic selectById(Topic topic);

    Topic selectById_BatchId(Topic topic);

    void updateWithSelectStatusById(Topic desTopic);

    void deleteById(Topic topic);

    List<Topic> selectByBatchIdWithSql(Map<String, Object> queryMap);

    List<TopicWithBLOBs> selectByTeacherId_BatchId(TopicWithBLOBs topic);

    List<TopicWithBLOBs> selectByTeacherId(TopicWithBLOBs topic);
}