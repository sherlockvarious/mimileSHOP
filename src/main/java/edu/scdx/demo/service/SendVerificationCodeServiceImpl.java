package edu.scdx.demo.service;

import edu.scdx.demo.dao.UserMapper;
import edu.scdx.demo.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */

@Service
public class SendVerificationCodeServiceImpl implements SendVerificationCodeService {

    @Resource
    UserMapper userMapper;


    @Resource
    private JavaMailSender mailSender;

    @Override
    public Boolean ifHasRegister(String email) {

        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(email);
        if (userMapper.countByExample(example) == 0) {
            return true;
        }
        return false;

    }

    @Override
    public List<String> sendMail(String email) {
        Random random = new Random();
        StringBuilder checkNum = new StringBuilder();
        List<String> retMsg = new ArrayList<>();

        String msg;
        try {
            for (int i = 0; i < 4; i++) {
                checkNum.append(Integer.toString(random.nextInt(10)));
            }

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("2089105070@qq.com");
            message.setTo(email);
            message.setSubject("欢迎注册米米乐商城");
            message.setText("【米米乐商城】验证码："+checkNum+"，15分钟内输入有效，立即注册");

            mailSender.send(message);
            msg = "200";
        }catch (Exception e){
            msg = "出错了";
            retMsg.add(msg);
            return retMsg;
        }

        retMsg.add(msg);
        retMsg.add(checkNum.toString());

        return retMsg;
    }
}