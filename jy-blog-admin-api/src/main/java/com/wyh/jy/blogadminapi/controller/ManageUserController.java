package com.wyh.jy.blogadminapi.controller;

import com.wyh.jy.db.mapper.UserInfoMapper;
import com.wyh.jy.db.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manager/用户管理")
public class ManageUserController {
    @Autowired
    UserInfoService userInfoService;
//    @RequestMapping("/update/{id}")
//    public Object updateUserInfoById(@PathVariable("id") int id){
//        return userInfoService.updateUserById(id , )
//    }

    @RequestMapping("/get/page/{page}")
    public Object getUsersByPage(@PathVariable("page") int page){
        return userInfoService.getUsersByPage(page);
    }
}
