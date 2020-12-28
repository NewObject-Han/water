package com.zking.ssm.settings.mapper;

import com.zking.ssm.settings.model.Area;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig
public interface AreaMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    List queryArea(Area record);
}