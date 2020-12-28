package com.zking.ssm.settings.controller;


import com.zking.ssm.settings.model.Area;
import com.zking.ssm.settings.model.MeterType;
import com.zking.ssm.settings.service.ISettingsMeterTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Meter")
@ResponseBody
public class MeterTypeController {
    @Autowired
    private ISettingsMeterTypeService iSettingsMeterTypeService;

    @RequestMapping("/Meterquery")
    public List queryMeterAll(MeterType meter){

        List list=iSettingsMeterTypeService.queryMeterType(meter);

        return list;
    };
    @RequestMapping("/Meteradd")
    public int Meteradd(MeterType meter){
        meter.setDisabled(0);
        int str=iSettingsMeterTypeService.insert(meter);
        return str;
    };

    @RequestMapping("/Meterdel")
    public int Meterdel(MeterType meter){
        int i = meter.getMid();

        int str=iSettingsMeterTypeService.deleteByPrimaryKey(i);

        return str;

    };

    @RequestMapping("/Meteredit")
    public int Meteredit(MeterType meter){
        int i = meter.getMid();
        meter.setDisabled(0);
        MeterType str=iSettingsMeterTypeService.updateByPrimaryKey(meter);

        return i;

    };
}
