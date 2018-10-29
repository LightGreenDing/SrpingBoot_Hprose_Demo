package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.User;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DingJieon 2018/10/29
 */
@RestController
public class TestController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/list")
    public String list() {
        return helloService.findUsers(1, 10);
    }
}
