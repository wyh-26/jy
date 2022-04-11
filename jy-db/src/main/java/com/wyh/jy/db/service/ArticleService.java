package com.wyh.jy.db.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mysql.cj.x.protobuf.MysqlxExpect;
import com.wyh.jy.db.entity.Article;
import com.wyh.jy.db.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;
    public List<Article> getAllArticle(){

        List<Article> articles = articleMapper.selectList(new QueryWrapper<Article>()
                .orderByDesc("id")
        );
        return articles;

    }

    public List<Article> getArticleByType(String type){
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("type",type);//写表中的列
//        List<Article> articles = articleMapper.selectByMap(columnMap);
        List<Article> articles = articleMapper.selectList(new QueryWrapper<Article>()
                .eq("type" , type)
                .orderByDesc("id")
        );
        return articles;
    }

    public Page<Article> getArticleByPage(int page){
        Page<Article> paget = new Page<>(page,5);
        Page<Article> articles = articleMapper.selectPage(paget,new QueryWrapper<Article>()
                .orderByDesc("id")
        );
        return articles;
    }

    public Page<Article> getArticleByTypeAndPage(String type , int page){
        Page<Article> paget = new Page<>(page , 5);
        Page<Article> articles = articleMapper.selectPage(paget, new QueryWrapper<Article>()
                .eq("type",type)
                .orderByDesc("id")
        );
        return articles;
    }

    public Article getArticleById(int id){
        return articleMapper.selectById(id);
    }

    public Object deleteArticleById(int id){
        articleMapper.deleteById(id);
        return null;
    }

    public Object addArticle(Article article){

        article.setPublish_date(new Date(System.currentTimeMillis()));
        articleMapper.insert(article);
        //mybatisplus会自动把当前插入对象在数据库中的id写回到该实体中
        System.out.println(article.getId());
        return null;
    }
}
