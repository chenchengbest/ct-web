package com.creazytooth.controller;

import com.creazytooth.interfac.cz.IUserInfoService;
import com.creazytooth.interfac.test.ITestUser;
import com.creazytooth.model.cz.OrgInfo;
import com.creazytooth.model.cz.UserInfo;
import com.creazytooth.model.test.test_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/30 0030.
 */
@Controller
@RequestMapping("/")
public class LoginControl {
    @Autowired
    public IUserInfoService userService;
    @Autowired
    public ITestUser testUserService;
    @RequestMapping(value = "/login", method = RequestMethod.GET) // 请求url地址映射，类似Struts的action-mapping
    public String login() {
        return "/login";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET) // 请求url地址映射，类似Struts的action-mapping
    public String hello() {
        return "/hello";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST) // 请求url地址映射，类似Struts的action-mapping
    @ResponseBody
    public List<UserInfo> login(String uname,String pwd) {
        UserInfo userInfoParam=new UserInfo();
        userInfoParam.setName("test");
        userInfoParam.setId(2);
        UserInfo userInfo=userService.getUserInfoById(userInfoParam);
        OrgInfo org=new OrgInfo();
        org.setOrgid(1);
        //userService.addUserIntoSchool(userInfoParam, org);
        List<UserInfo> userInfoList=new ArrayList();
        userInfoList.add(userInfo);

        test_user testUser=testUserService.getTestUserById();
        return userInfoList;
    }
}
