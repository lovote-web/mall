package com.lovoteweb.mallproject.service;

import com.lovoteweb.mallproject.service.serviceImpl.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.concurrent.TimeUnit;

public class RedisServiceImpl implements RedisService {

    @Autowired
    StringRedisTemplate stringredisTemplate;

    @Override
    public void set(String key, String value) {
        stringredisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        return stringredisTemplate.opsForValue().get(key);
    }

    @Override
    public boolean expire(String key, long expire) {
        return stringredisTemplate.expire(key,expire, TimeUnit.SECONDS);
    }

    @Override
    public void remove(String key) {
        stringredisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long delta) {
        return stringredisTemplate.opsForValue().increment(key,delta);
    }
}
