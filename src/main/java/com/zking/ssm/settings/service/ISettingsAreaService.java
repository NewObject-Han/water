package com.zking.ssm.settings.service;

import com.zking.ssm.settings.model.Area;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional


public interface ISettingsAreaService {
    int deleteByPrimaryKey(Integer aid);

    int insert(Area record);

    int insertSelective(Area record);

    @Transactional(readOnly = true)
    Area selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Area record);

    Area updateByPrimaryKey(Area record);

    @Transactional(readOnly = true)
    List queryArea(Area record);
}
