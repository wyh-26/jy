package com.wyh.jy.db.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wyh.jy.db.entity.Article;
import com.wyh.jy.db.entity.UserInfo;
import com.wyh.jy.db.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    public UserInfo getUserInfo(){
        UserInfo userInfo = userInfoMapper.selectById(1);
        return userInfo;
    }

    public Page<UserInfo> getUsersByPage(int page){
        Page<UserInfo> paget = new Page<>(page,5);
        Page<UserInfo> users = userInfoMapper.selectPage(paget,null);
        return users;
    }
}
