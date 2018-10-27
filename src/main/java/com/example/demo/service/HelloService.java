package com.example.demo.service;

/**
 * HelloService接口
 *
 * @author Ding.Jie
 */
public interface HelloService {
    /**
     * sayHello方法
     *
     * @param request 请求参数数据(JSON字符串)
     * @return 处理后的业务数据(JSON字符串)
     */
    String sayHello(String request);

    /**
     * sayBye方法
     *
     * @param request 请求数据
     * @return
     */
    String sayBye(String request);

    /**
     * getUser方法
     *
     * @param request 请求数据
     * @return
     */
    String getUser(String request);

    /**
     * 删除
     *
     * @param request 请求数据
     * @return
     */
    String removeUser(String request);
}
