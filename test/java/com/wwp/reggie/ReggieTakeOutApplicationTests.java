package com.wwp.reggie;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ReggieTakeOutApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(JSON.toJSON(LocalDateTime.now()));
    }

}
