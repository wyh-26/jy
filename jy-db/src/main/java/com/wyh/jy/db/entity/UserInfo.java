package com.wyh.jy.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "table_userinfo")//指定表名
public class UserInfo {
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private int id;

    private String head;
    @TableField(value = "user_name",exist = true)
    private String userName;
    @TableField(value = "user_talk",exist = true)
    private String userTalk;
    @TableField(value = "github_url",exist = true)
    private String githubUrl;
    @TableField(value = "gitee_url",exist = true)
    private String giteeUrl;
    @TableField(value = "email_url",exist = true)
    private String emailUrl;
    @TableField(value = "leetcode_url",exist = true)
    private String leetCodeUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTalk() {
        return userTalk;
    }

    public void setUserTalk(String userTalk) {
        this.userTalk = userTalk;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getGiteeUrl() {
        return giteeUrl;
    }

    public void setGiteeUrl(String giteeUrl) {
        this.giteeUrl = giteeUrl;
    }

    public String getEmailUrl() {
        return emailUrl;
    }

    public void setEmailUrl(String emailUrl) {
        this.emailUrl = emailUrl;
    }

    public String getLeetCodeUrl() {
        return leetCodeUrl;
    }

    public void setLeetCodeUrl(String leetCodeUrl) {
        this.leetCodeUrl = leetCodeUrl;
    }
}
