package com.example.demo.base;

import com.example.demo.respone.ResponeResult;

import java.util.ArrayList;

/**
 * 父类Servic
 * 定义返回数据封装
 *
 * @author Ding.Jie
 */
public class BaseService {

    public static ResponeResult success(Object object) {
        ResponeResult responeResult = new ResponeResult();
        responeResult.setCode(0);
        responeResult.setMsg("成功");
        responeResult.setData(object);
        return responeResult;
    }

    public static ResponeResult error() {
        ResponeResult responeResult = new ResponeResult();
        responeResult.setCode(-1);
        responeResult.setMsg("失败");
        return responeResult;
    }

    public static ResponeResult success() {
        return success(null);
    }

    public static ResponeResult error(Integer code, String msg) {
        ResponeResult responeResult = new ResponeResult();
        responeResult.setCode(code);
        responeResult.setMsg(msg);
        responeResult.setData(new ArrayList<>());
        return responeResult;
    }
}
