package com.zking.ssm.settings.service;

import com.zking.ssm.settings.model.DePt;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ISettingsDePtService {
    int deleteByPrimaryKey(Integer did);

    int insert(DePt record);

    int insertSelective(DePt record);

    @Transactional(readOnly = true)
    DePt selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(DePt record);

    DePt updateByPrimaryKey(DePt record);

    @Transactional(readOnly = true)
    List queryDePt(DePt record);
}
