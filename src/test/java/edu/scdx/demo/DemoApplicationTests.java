package edu.scdx.demo;

import edu.scdx.demo.dao.UserMapper;
import edu.scdx.demo.entity.User;
import edu.scdx.demo.entity.UserExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.util.List;

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
        UserExample user  = new UserExample();
        user.createCriteria().andUserIdEqualTo(userId).andPasswordEqualTo(password);
        List<User> hello=userMapper.selectByExample(user);

        System.out.println(hello.get(0).getEmail());

        User one = new User();
        one.setPassword("1111");
        one.setUserId("3");
        one.setEmail("2737793332@qq.com");
        one.setNickName("nihaoya");

        userMapper.insert(one);


    }

}
