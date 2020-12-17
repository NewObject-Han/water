package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Sumreport;

/**
 * @author liang
 * @create 2020-12-17-16:10
 */
public interface IChargeSumreportService {
    int deleteByPrimaryKey(Integer sid);

    int insert(Sumreport record);

    int insertSelective(Sumreport record);

    Sumreport selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Sumreport record);

    int updateByPrimaryKey(Sumreport record);
}
