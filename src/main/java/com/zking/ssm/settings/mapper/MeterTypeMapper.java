package com.zking.ssm.settings.mapper;

import com.zking.ssm.settings.model.MeterType;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig
public interface MeterTypeMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(MeterType record);

    int insertSelective(MeterType record);

    MeterType selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(MeterType record);

    int updateByPrimaryKey(MeterType record);

    List queryMeterType(MeterType record);
}