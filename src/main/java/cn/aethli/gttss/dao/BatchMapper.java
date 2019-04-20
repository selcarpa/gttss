package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.Batch;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface BatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insert(Batch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table batch
     *
     * @mbg.generated Sat Apr 20 09:20:33 CST 2019
     */
    int insertSelective(Batch record);

    Batch selectByDate(Map<String, Object> m);
}