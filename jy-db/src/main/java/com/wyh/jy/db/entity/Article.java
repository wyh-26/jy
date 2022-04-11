package com.wyh.jy.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Date;

@TableName(value = "table_article")
public class Article {
    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private int id;
    private String cover;
    private String title;
    private String content;
    private String type;
    @TableField(value = "publish_date",exist = true)
    private Date publishDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getPublish_date() {
        return publishDate;
    }

    public void setPublish_date(Date publish_date) {
        this.publishDate = publish_date;
    }
}
