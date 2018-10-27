package com.example.demo.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 消息发送类
 *
 * @author DingJie
 */
@Component
public class HelloSender {
    private Logger logger = LoggerFactory.getLogger(HelloSender.class);
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public String send(String name) {
        String context = "hello" + name + "--" + new Date();
        rabbitTemplate.convertAndSend(context);
        logger.info("HelloSender发送消息: " + context);
        return context;
    }
}
