package com.zking.ssm.settings.service.imp;

import com.zking.ssm.settings.mapper.DePtMapper;
import com.zking.ssm.settings.model.DePt;
import com.zking.ssm.settings.service.ISettingsDePtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class ISettingsDePtServiceImpl implements ISettingsDePtService {
    @Autowired
    private DePtMapper dePtMapper;
    @Override
    public int deleteByPrimaryKey(Integer did) {
        return dePtMapper.deleteByPrimaryKey(did);
    }

    @Override
    public int insert(DePt record) {
        return dePtMapper.insert(record);
    }

    @Override
    public int insertSelective(DePt record) {
        return 0;
    }

    @Override
    public DePt selectByPrimaryKey(Integer did) {
        return dePtMapper.selectByPrimaryKey(did);
    }

    @Override
    public int updateByPrimaryKeySelective(DePt record) {
        return 0;
    }

    @Override
    public DePt updateByPrimaryKey(DePt record) {
        dePtMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryDePt(DePt record) {
        return dePtMapper.queryDePt(record);
    }
}
