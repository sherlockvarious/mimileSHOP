package edu.scdx.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

@ComponentScan("edu.scdx.demo.entity")
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }


    @Resource
    UserMapper userMapper;

    @Test
    void test(){
        String userId = "1";
        String password = "111111";

        userMapper.
    }

}
