package com.zking.ssm.settings.mapper;

import com.zking.ssm.settings.model.DePt;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig
public interface DePtMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(DePt record);

    int insertSelective(DePt record);

    DePt selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(DePt record);

    int updateByPrimaryKey(DePt record);

    List queryDePt(DePt record);
}