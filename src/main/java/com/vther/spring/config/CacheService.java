package com.vther.spring.config;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable("value")
    public double getValue() {
        double random = Math.random();
        System.out.println("do not use cache");
        return Math.random();
    }
}
