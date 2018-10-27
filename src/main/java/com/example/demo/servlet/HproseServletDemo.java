package com.example.demo.servlet;

import com.example.demo.service.HelloService;
import hprose.common.HproseMethods;
import hprose.server.HproseServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * HproseServlet服务注册接口
 * Created by Ding.Jie on 2018/10/23
 */
@WebServlet(urlPatterns = {"/api/v1.0.0/javatest/sayHello", "/api/v1.0.0/javatest/sayBye", "/api/v1.0.0/javatest/getUser"}, initParams = {@WebInitParam(name = "crossDomain", value = "true"),
        @WebInitParam(name = "debug", value = "true"), @WebInitParam(name = "get", value = "true")})
//标记为servlet，以便启动器扫描。
public class HproseServletDemo extends HproseServlet {
    @Autowired
    private HelloService helloService;

    @Override
    public void setGlobalMethods(HproseMethods methods) {
        super.setGlobalMethods(methods);
//        methods.addMethod("sayHello",helloService); 注册sayHello单个方法
        methods.addInstanceMethods(helloService);//注册HelloService下所有的publice方法
    }
}
