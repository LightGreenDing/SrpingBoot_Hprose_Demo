package com.example.demo.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息接收类
 *
 * @author DingJie
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {
    private Logger logger = LoggerFactory.getLogger(HelloReceiver.class);

    @RabbitHandler
    public void process(String hello) {
        logger.info("HelloReceiver接收到消息 : " + hello + new Date());
    }

}

