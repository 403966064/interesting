package com.tiany.redis.messagequeue;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * Created by tiany on 2017/7/19.
 */
public class RedisReceiver {

    private CountDownLatch countDownLatch;

    @Autowired
    public RedisReceiver(CountDownLatch latch){
            this.countDownLatch = latch;
    }

    public void receiveMessage(String message){
        System.out.println("receiver 接收到"+message);
        countDownLatch.countDown();
    }
}
