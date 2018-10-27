package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.demo.base.BaseService;
import com.example.demo.base.ResponeResult;
import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.request.ResultData;
import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * HelloService接口实现类
 *
 * @author Ding.Jie
 */
@Service
public class HelloServiceImpl extends BaseService implements HelloService {
    @Autowired
    private UserDao userDao;

    /**
     * sayHello方法
     *
     * @param request 请求参数数据(JSON字符串)
     * @return 处理后的业务数据(JSON字符串)
     */
    @Override
    public String sayHello(String request) {
        ResultData resultData = JSON.parseObject(request, new TypeReference<ResultData>() {
        });
        System.out.println(resultData);
        User user = userDao.findUserById(1);
        ResponeResult success = success(user);
        return JSON.toJSONString(success);
    }

    @Override
    public String sayBye(String request) {
        ResponeResult error = error(700, "手机号错误");
//        ResponeResult error = error();
        return JSON.toJSONString(error);
    }

    @Override
    public String getUser(String request) {
        System.out.println("getUser方法");
        User user = userDao.findUserById(1);
        ResponeResult success = success(user);
        return JSON.toJSONString(success);
    }

    @Override
    @Transactional
    public String removeUser(String request) {
        System.out.println("removeUser方法");
        userDao.removeById(9374175);
        ResponeResult success = success();
        return JSON.toJSONString(success);
    }
}
