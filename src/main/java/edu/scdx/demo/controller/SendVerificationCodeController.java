package edu.scdx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 27377-sun chao
 * @date 2020/7/19
 * @school SiChuan University
 */

@Controller
public class SendVerificationCodeController {

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping("/sendVerificationCode")
    public String sendSimpleMail(String email) throws Exception {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2089105070@qq.com");
        message.setTo(email);
        message.setSubject("主题：简单邮件");
        message.setText("测试邮件内容");

        mailSender.send(message);

        return "index";
    }
}