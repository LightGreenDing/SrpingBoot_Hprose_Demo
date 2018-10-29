package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * HelloService接口
 *
 * @author Ding.Jie
 */
public interface HelloService {
    /**
     * sayHello方法
     * 测试成功返回
     *
     * @param request 请求参数数据(JSON字符串)
     * @return 处理后的业务数据(JSON字符串)
     */
    String sayHello(String request);

    /**
     * sayBye方法
     * 测试返回异常
     *
     * @param request 请求数据
     * @return 处理后的业务数据(JSON字符串)
     */
    String sayBye(String request);

    /**
     * getUser方法
     * 测试返回收据库数据
     *
     * @param request 请求数据
     * @return 处理后的业务数据(JSON字符串)
     */
    String getUser(String request);

    /**
     * 删除
     *
     * @param request 请求数据
     * @return 处理后的业务数据(JSON字符串)
     */
    String removeUser(String request);

    /**
     * 获取所有的用户
     *分页
     * @return
     */
    String findUsers(int page, int size);
}
