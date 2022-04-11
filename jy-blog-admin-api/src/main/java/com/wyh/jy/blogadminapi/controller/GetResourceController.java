package com.wyh.jy.blogadminapi.controller;

import com.wyh.jy.blogadminapi.Propertis.ImagePropertis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


@RestController
@RequestMapping("/get")
public class GetResourceController {
    @Autowired
    ImagePropertis imagePropertis;
    //name要求为绝对路径
    @RequestMapping(value = "/image/{name}",produces  = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_PNG_VALUE})
    public BufferedImage getImage(@PathVariable("name") String name) throws IOException {
        //绝对路径
        //从配置文件获取图片存放的路径

//        String pathName = "D:\\Projects\\ideaProjects\\jy\\jy-blog-admin-api\\src\\main\\resources\\static\\image\\" + name;

        String pathName = imagePropertis.getPath() + name;
        System.out.println("fjsjfosjfosfj" + name);
        return ImageIO.read(new FileInputStream(new File(pathName) ));

    }




}
