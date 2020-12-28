package com.zking.ssm.settings.service;

import com.zking.ssm.settings.model.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISettingsEmpService {

    @Transactional(readOnly = true)
    Emp doLogin(Emp remp);//登录

    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    @Transactional(readOnly = true)
    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    Emp updateByPrimaryKey(Emp record);

    @Transactional(readOnly = true)
    List queryEmp(Emp record);


}
