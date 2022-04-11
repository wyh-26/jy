package com.wyh.jy.bloguserapi.controller;

import com.wyh.jy.db.entity.Article;
import com.wyh.jy.db.mapper.ArticleMapper;
import com.wyh.jy.db.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/all-article")
    public Object getAllArticles(){
        return articleService.getAllArticle();
    }

    @RequestMapping("/article/id/{id}")
    public Object getArticleById(@PathVariable("id") int id){
        return articleService.getArticleById(id);
    }

    @RequestMapping("/article/page/{page}")
    public Object getArticlesByPage(@PathVariable("page") int page){
        return articleService.getArticleByPage(page);
    }

    @RequestMapping("/article/type/{type}/page/{page}")
    public Object getArticlesByTypeAndPage(@PathVariable("type") String type , @PathVariable("page") int page){
        return articleService.getArticleByTypeAndPage(type , page);
    }

    @RequestMapping("/article/type/{type}")
    public Object getArticlesByType(@PathVariable("type") String type){
        return articleService.getArticleByType(type);
    }

}

