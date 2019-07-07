package com.hb.monitor.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/demo")
    @ResponseBody
    public String Test() {
        return "hello,world!";
    }

    @RequestMapping("/login")
    public String login() {
        return "login-sign";
    }


    @RequestMapping("/login-error")
    public String loginError() {
        return "login-error";
    }

    @RequestMapping("/whoim")
    @ResponseBody
    public Object whoIm() {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    @RequestMapping("/index")
    public String homepage() {
        return "index";
    }


}
