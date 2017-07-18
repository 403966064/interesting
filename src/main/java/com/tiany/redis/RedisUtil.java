package com.tiany.redis;

import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by tiany on 2017/7/18.
 */
@Repository
public class RedisUtil {

    @Resource(name="redisTemplate")
    protected ValueOperations<String, String> valueOperations;

    public String getValue(String key){
        return valueOperations.get(key);
    }
}
