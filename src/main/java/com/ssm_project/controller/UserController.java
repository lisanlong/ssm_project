package com.ssm_project.controller;

import com.ssm_project.entity.User;
import com.ssm_project.intercept.Logs;
import com.ssm_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/sign", method = RequestMethod.POST)
    @Logs(operationName="登录保存")
    public String signUpPage(HttpServletRequest request) {
        User user = new User();
        user.setPassword("123456");
        user.setRole(123);
        user.setUserName("lisanlong");
        userService.insert(user);
        return "aaa";
    }

}
