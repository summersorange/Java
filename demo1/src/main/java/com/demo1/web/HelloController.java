package com.demo1.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @RequestMapping("hello")
    //返回的第一个数据添加responseBody
    @ResponseBody
    public String hello(){
        return "hello,spring boot!";
    }
}
