package com.wyh.jy.bloguserapi.controller;

import com.wyh.jy.db.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-info")

public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("/info")
    public Object getUserInfo(){
        return userInfoService.getUserInfo();
    }
}
