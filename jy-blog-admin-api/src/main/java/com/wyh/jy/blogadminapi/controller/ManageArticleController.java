package com.wyh.jy.blogadminapi.controller;




import com.wyh.jy.blogadminapi.Propertis.ImagePropertis;
import com.wyh.jy.blogadminapi.vo.Data;
import com.wyh.jy.blogadminapi.vo.ResSuccess;

import com.wyh.jy.db.entity.Article;
import com.wyh.jy.db.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;



@RestController
@RequestMapping("/manager/文章管理")
public class ManageArticleController {
    @Autowired
    ArticleService articleService;
    @Autowired
    ImagePropertis imagePropertis;

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public Object addArticle(Article article){
        System.out.println(article.getTitle());

        return articleService.addArticle(article);
    }

    @RequestMapping("/delete/{id}")
    public Object deleteArticle(@PathVariable("id") int id){
        articleService.deleteArticleById(id);
        return null;
    }

    @RequestMapping("/update")
    public Object updateArticle(Object reqBoday){
        return null;
    }

    @RequestMapping("/get/page/{page}")
    public Object getArticlesByPage(@PathVariable("page") int page){
        return articleService.getArticleByPage(page);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }



    @RequestMapping(value = "/upload-image")
    private Object uploadImage(@RequestParam("file") MultipartFile file ){
        if (file.isEmpty()){
            return null;
        }
        String filename = file.getOriginalFilename(); //获取上传文件原来的名称

        String filePath = imagePropertis.getPath();
        File temp = new File(filePath);
        if (!temp.exists()){
            temp.mkdirs();
        }

        File localFile = new File(filePath+filename);
        try {
            file.transferTo(localFile); //把上传的文件保存至本地
            System.out.println(file.getOriginalFilename()+" 上传成功");
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }


        String path = "http://localhost:8080/get/image/" + filename;
        return new ResSuccess(path);

    }








}
