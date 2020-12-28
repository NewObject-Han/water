package com.zking.ssm.charge.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-16-17:06
 */
public class IChargeUserServiceTest extends BaseTestCase {
    @Autowired
    private IChargeUserService chargeUserService;
    private User user;
    @Before
    public void setUp() throws Exception {
        user=new User();
    }

    @Test
    public void queryUserList() {
        PageHelper.startPage(0,5);
        user.setUsername("a");
        List list = chargeUserService.queryUserList(user);
        list.add(user);
        PageInfo pageInfo=new PageInfo(list);
        list.forEach(l->{
            System.out.println(l);
        });
    }
}