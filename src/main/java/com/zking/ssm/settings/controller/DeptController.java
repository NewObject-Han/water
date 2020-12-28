package com.zking.ssm.settings.controller;

import com.zking.ssm.settings.model.Area;

import com.zking.ssm.settings.model.DePt;
import com.zking.ssm.settings.service.ISettingsDePtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Dept")
public class DeptController {
    @Autowired
    private ISettingsDePtService iSettingsDePtService;

    @RequestMapping("/Deptquery")
    @ResponseBody
    public List Deptquery(DePt dept) {
        List list = iSettingsDePtService.queryDePt(dept);
        return list;
    }

    ;

    @RequestMapping("/Deptadd")
    @ResponseBody
    public int Deptadd(DePt dept) {
        dept.setDisabled(0);
        int str = iSettingsDePtService.insert(dept);
        return str;
    }

    ;

    @RequestMapping("/Deptdel")
    @ResponseBody
    public int Deptdel(DePt dept) {
        int i = dept.getDid();

        int str = iSettingsDePtService.deleteByPrimaryKey(i);

        return str;

    }

    ;

    @RequestMapping("/Deptedit")
    public int DePtedit(DePt dept) {
        int i = dept.getDid();
        dept.setDisabled(0);
        DePt str = iSettingsDePtService.updateByPrimaryKey(dept);
        return i;

    }

    ;
}
