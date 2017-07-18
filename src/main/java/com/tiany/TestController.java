package com.tiany;

import com.tiany.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tiany on 2017/7/18.
 */
@RestController
@EnableAutoConfiguration
public class TestController {
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/test")
    String test(){
        System.out.println(redisUtil.getValue("test"));
        return redisUtil.getValue("test");
    }


}
