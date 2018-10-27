package com.example.demo;

import com.example.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ding.Jie on 2018/10/24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HellpServiceTest {
    @Autowired
    private HelloService helloService;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Test
    public void removeTest() {
        helloService.removeUser(String.valueOf(9374175));
    }

    @Test
    public void getTest() {
        String user = helloService.getUser("");
        System.err.println(user);
    }
    @Test
    public void sendMessage() {
        //发送消息
        this.rabbitTemplate.convertAndSend("hello", "你好,rabbitmq，我是java消息");
    }

//    /**
//     * 消息接受
//     *
//     * @param message
//     */
//    @RabbitListener(queues = "hello")  //监听器监听指定的QueueName
//    public void receive(String message) {
//        System.out.println("接收消息:" + message);
//    }
}
