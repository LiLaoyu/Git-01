package com.itheima.boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//@RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用。
public class HelloController {

    //url:配置里的属性,url:你想配置的名称,
    //为了方便才起了一样的名称
    @Value("${url}")
    private String url;

    @Autowired
    private Environment env;

    @RequestMapping("/halo")
    public String heeeeelo(){
        return "Hello Spring Boot  --url:"+url+"env:"+env.getProperty("url");
    }

}
