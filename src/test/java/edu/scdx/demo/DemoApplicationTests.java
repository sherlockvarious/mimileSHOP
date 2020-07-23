package edu.scdx.demo;

import edu.scdx.demo.dao.OrdersMapper;
import edu.scdx.demo.dao.UserMapper;
import edu.scdx.demo.entity.Orders;
import edu.scdx.demo.entity.OrdersExample;
import edu.scdx.demo.entity.User;
import edu.scdx.demo.entity.UserExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
        int userId = 1;
        String password = "111111";
        UserExample example  = new UserExample();
        example.createCriteria().andUserIdEqualTo(userId).andPasswordEqualTo(password);
        List<User> hello=userMapper.selectByExample(example);

        System.out.println(hello.get(0).getEmail());

        User one = new User();
        one.setPassword("1111");
        one.setUserId(5);
        one.setEmail("2737793332@qq.com");
        one.setNickName("nihaoya");

        userMapper.insert(one);


    }

    @Autowired
    private JavaMailSender mailSender;

    @Test
    /**
     * 测试发送验证码
     */
    void sendMail(){
        Random random = new Random();
        String email = "2737793330@qq.com";
        StringBuilder checkNum = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            checkNum.append(Integer.toString(random.nextInt(10)));
        }

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2089105070@qq.com");
        message.setTo(email);
        message.setSubject("欢迎注册米米乐商城");
        message.setText("【米米乐商城】验证码："+checkNum+"，15分钟内输入有效，立即注册");

        mailSender.send(message);
    }

    @Test
    void checkIsIn(){
        String email = "27377933330@qq.com";
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(email);
        long num =userMapper.countByExample(userExample);
        if (num>0)
            System.out.println("已经注册过了");
        else {
            System.out.println("可以注册");
        }

    }

    @Test
    void register(){

    }

    @Resource
    OrdersMapper ordersMapper;
    @Test
    void insertOrder(){

        for (int i = 0; i < 50 ; i++) {
            Date date = new Date();
            Orders order = new Orders();
            order.setUserId(52);
            order.setGoodsId(1);

            order.setDeliveryTime(date);
            order.setCreationTime(date);
            order.setPayTime(date);
          //  order.setReceivingTime(date);

            ordersMapper.insertSelective(order);
        }


    }

    @Test
    void test9(){
        int orderId = 143;
        OrdersExample example = new OrdersExample();
        example.createCriteria().andOrderIdEqualTo(orderId);
        Orders orders = new Orders();
        orders.setDeliveryTime(new Date());


        ordersMapper.updateByExampleSelective(orders,example);
    }



}
