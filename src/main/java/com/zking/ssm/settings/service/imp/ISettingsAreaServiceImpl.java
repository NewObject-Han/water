package com.zking.ssm.settings.service.imp;

import com.zking.ssm.settings.mapper.AreaMapper;
import com.zking.ssm.settings.model.Area;
import com.zking.ssm.settings.service.ISettingsAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class ISettingsAreaServiceImpl implements ISettingsAreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public int deleteByPrimaryKey(Integer aid) {
        return areaMapper.deleteByPrimaryKey(aid);
    }

    @Override
    public int insert(Area record) {
        return areaMapper.insert(record);
    }

    @Override
    public int insertSelective(Area record) {
        return areaMapper.insertSelective(record);
    }

    @Override
    public Area selectByPrimaryKey(Integer aid) {
        return areaMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int updateByPrimaryKeySelective(Area record) {
        return 0;
    }

    @Override
    public Area updateByPrimaryKey(Area record) {
        areaMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryArea(Area record) {
        return areaMapper.queryArea(record);
    }
}
