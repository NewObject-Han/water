package com.zking.ssm.settings.service.imp;

import com.zking.ssm.settings.mapper.MeterTypeMapper;
import com.zking.ssm.settings.model.MeterType;
import com.zking.ssm.settings.service.ISettingsMeterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class ISettingsMeterTypeServiceImpl implements ISettingsMeterTypeService {
    @Autowired
    private MeterTypeMapper meterTypeMapper;

    @Override
    public int deleteByPrimaryKey(Integer mid) {
        return meterTypeMapper.deleteByPrimaryKey(mid);
    }

    @Override
    public int insert(MeterType record) {
        return meterTypeMapper.insert(record);
    }

    @Override
    public int insertSelective(MeterType record) {
        return 0;
    }

    @Override
    public MeterType selectByPrimaryKey(Integer mid) {
        return meterTypeMapper.selectByPrimaryKey(mid);
    }

    @Override
    public int updateByPrimaryKeySelective(MeterType record) {
        return 0;
    }

    @Override
    public MeterType updateByPrimaryKey(MeterType record) {
        meterTypeMapper.updateByPrimaryKey(record);
        return record;
    }

    @Override
    public List queryMeterType(MeterType record) {
        return meterTypeMapper.queryMeterType(record);
    }
}
