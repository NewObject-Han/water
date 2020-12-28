package com.zking.ssm.settings.controller;


import com.zking.ssm.settings.model.Emp;
import com.zking.ssm.settings.model.MeterType;
import com.zking.ssm.settings.service.ISettingsEmpService;

import com.zking.ssm.util.JsonData;
import com.zking.ssm.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/emp")
@ResponseBody
public class EmpController {
    @Autowired
    private ISettingsEmpService iSettingsEmpService;

    @RequestMapping("/dLogin")
    public JsonData dologin(Emp emp) {
        Emp remp = iSettingsEmpService.doLogin(emp);
        MD5Utils md5Utils = new MD5Utils();
        JsonData jsonData = new JsonData();
        if (remp == null) {
            jsonData.put("message", "账号错误，请重新输入");
            jsonData.put("code", -1);
            return jsonData;
        } else {
            String password = emp.getPwd();
            boolean saltverifyMD5 = md5Utils.getSaltverifyMD5(password, remp.getPwd());
            if (saltverifyMD5) {
                jsonData.put("message", "欢迎回来！");
                jsonData.put("code", 1);
                return jsonData;
            } else {
                jsonData.put("message", "密码有误，请重新输入");
                jsonData.put("code", 2);
                return jsonData;
            }
        }
    }


    @RequestMapping("/Empadd")
    public int Empadd(Emp emp) {

        emp.setDisabled(0);
        int str = iSettingsEmpService.insert(emp);


        return str;
    }

    ;

    @RequestMapping("/Empdel")
    public int Empdel(Emp emp) {
        int i = emp.getEid();

        int str = iSettingsEmpService.deleteByPrimaryKey(i);

        return str;

    }

    ;

    @RequestMapping("/Empedit")
    public int Empedit(Emp emp) {
        int i = emp.getEid();
        emp.setDisabled(0);
        Emp str = iSettingsEmpService.updateByPrimaryKey(emp);

        return i;

    }

    ;

    @RequestMapping("/Empquery")
    public List queryEmpAll(Emp emp) {
        List list = iSettingsEmpService.queryEmp(emp);
        return list;
    }

    ;


}
