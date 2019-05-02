package cn.aethli.gttss.dao;

import cn.aethli.gttss.domain.OpeningReport;
import cn.aethli.gttss.domain.OpeningReportWithBLOBs;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public interface OpeningReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openingreport
     *
     * @mbg.generated Sun Apr 21 14:15:57 CST 2019
     */
    int insert(OpeningReportWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openingreport
     *
     * @mbg.generated Sun Apr 21 14:15:57 CST 2019
     */
    int insertSelective(OpeningReportWithBLOBs record);

    OpeningReportWithBLOBs selectByTopicId(OpeningReportWithBLOBs openingReport);

    OpeningReportWithBLOBs selectByStudentId(Map<String, Object> queryMap);

    void deleteByTopicId(OpeningReportWithBLOBs openingReport);

    void updateWithTeacherVerifyIdByTopicId(OpeningReportWithBLOBs openingReport);
}