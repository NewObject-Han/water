package com.zking.ssm.settings.mapper;

import com.zking.ssm.settings.model.Emp;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@CacheConfig
public interface EmpMapper {


    Emp doLogin(Emp remp);//登录

    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List queryEmp(Emp record);//查询

}