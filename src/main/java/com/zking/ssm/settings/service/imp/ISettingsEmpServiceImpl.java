package com.zking.ssm.settings.service.imp;

import com.zking.ssm.settings.mapper.EmpMapper;
import com.zking.ssm.settings.model.Emp;
import com.zking.ssm.settings.service.ISettingsEmpService;
import com.zking.ssm.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class ISettingsEmpServiceImpl implements ISettingsEmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public int deleteByPrimaryKey(Integer eid) {
        return empMapper.deleteByPrimaryKey(eid);
    }

    @Override
    public int insert(Emp record) {
        //md5+盐
        MD5Utils md5 = new MD5Utils();
        String salt = md5.getSalt();
        String md51 = md5.getSaltMD5(salt, record.getPwd());
        record.setPwd(md51);
        record.setSalt(salt);

        return empMapper.insert(record);
    }

    @Override
    public int insertSelective(Emp record) {
        return empMapper.insertSelective(record);
    }

    @Override
    public Emp selectByPrimaryKey(Integer eid) {
        return empMapper.selectByPrimaryKey(eid);
    }

    @Override
    public int updateByPrimaryKeySelective(Emp record) {
        return 0;
    }

    @Override
    public Emp updateByPrimaryKey(Emp record) {
        empMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryEmp(Emp record) {
        return empMapper.queryEmp(record);
    }

    @Override

    public Emp doLogin(Emp remp) {
        return empMapper.doLogin(remp);
    }


}
