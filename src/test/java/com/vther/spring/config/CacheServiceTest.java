package com.vther.spring.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CacheConfig.class})
public class CacheServiceTest {

    @Autowired
    private CacheService cacheService;

    @Test
    public void getValue() throws Exception {
        double value1 = cacheService.getValue();
        System.out.println("value1 = " + value1);
        double value2 = cacheService.getValue();
        System.out.println("value2 = " + value2);
    }

}