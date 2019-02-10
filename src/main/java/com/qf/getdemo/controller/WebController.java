package com.qf.getdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cgj
 * @Date 2019/2/10
 */
@Controller
@RequestMapping("web")
public class WebController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        return "hello  git" ;
    }
}
