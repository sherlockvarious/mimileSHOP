package edu.scdx.demo.controller;

import edu.scdx.demo.entity.User;
import edu.scdx.demo.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 27377-sun chao
 * @date 2020/7/19
 * @school SiChuan University
 */
@RequestMapping("/register")

@Controller
public class RegisterController {

    @Resource
    RegisterService registerService;

    @RequestMapping("/user")
    @ResponseBody
    public String registerUser(User user) {
        if (registerService.registerUser(user)) {
            return "200";
        } else {
            return "注册失败";
        }
    }
}