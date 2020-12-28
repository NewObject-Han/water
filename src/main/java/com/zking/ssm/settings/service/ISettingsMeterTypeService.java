package com.zking.ssm.settings.service;

import com.zking.ssm.settings.model.MeterType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ISettingsMeterTypeService {
    int deleteByPrimaryKey(Integer mid);

    int insert(MeterType record);

    int insertSelective(MeterType record);

    @Transactional(readOnly = true)
    MeterType selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MeterType record);

    MeterType updateByPrimaryKey(MeterType record);

    @Transactional(readOnly = true)
    List queryMeterType(MeterType record);

}
