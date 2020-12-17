package com.zking.ssm.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.User;
import com.zking.ssm.charge.service.IChargeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-16-17:45
 */
@Controller
@RequestMapping("/ChargeUser")
public class UserAction {
    @Autowired
    private IChargeUserService iChargeUserService;
    private User user=new User();

    @RequestMapping("/queryUser")
    @ResponseBody
    public PageInfo queryUser(String pageNum,String pageSize,User user){
        PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageNum));
        List list = iChargeUserService.queryUserList(user);
        PageInfo pageInfo=new PageInfo(list);
        return  pageInfo;
    }
}
