package com.tiany.redis.messagequeue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

import java.util.concurrent.CountDownLatch;

/**
 * Created by tiany on 2017/7/19.
 */
@SpringBootApplication
public class App {
    @Bean
    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
                                            MessageListenerAdapter listenerAdapter){
        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter(RedisReceiver redisReceiver){
        return new MessageListenerAdapter(redisReceiver, "receiveMessage");
    }

    @Bean
    CountDownLatch latch(){
        return new CountDownLatch(1);
    }

    @Bean
    RedisReceiver redisReceiver(CountDownLatch latch){
        return new RedisReceiver(latch);
    }

    @Bean
    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
        return new StringRedisTemplate(connectionFactory);
    }

    public static void main(String[] args) throws InterruptedException{
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);

        CountDownLatch latch = ctx.getBean(CountDownLatch.class);

        System.out.println("Sending message ...");
        template.convertAndSend("chat","hello from redis");

        latch.await();

        System.exit(0);
    }
}
