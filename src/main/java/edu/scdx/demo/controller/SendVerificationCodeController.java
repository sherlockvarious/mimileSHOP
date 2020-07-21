package edu.scdx.demo.controller;

import edu.scdx.demo.service.SendVerificationCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/19
 * @school SiChuan University
 */
@RequestMapping("/send")
@Controller
public class SendVerificationCodeController {

    @Resource
    private SendVerificationCodeService sendService;

    @RequestMapping("/VerificationCode")
    @ResponseBody
    public List<String> sendSimpleMail(String email, HttpServletResponse response) throws Exception {

        String msg;
        List<String> retMsg = new ArrayList<>();

        if (!sendService.ifHasRegister(email)) {
            msg = "该邮箱已被注册";
            retMsg.add(msg);
            return retMsg;
        }

        retMsg = sendService.sendMail(email);

        return retMsg;

    }
}