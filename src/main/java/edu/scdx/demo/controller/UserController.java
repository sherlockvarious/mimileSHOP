package edu.scdx.demo.controller;

import edu.scdx.demo.entity.User;
import edu.scdx.demo.service.SendVerificationCodeService;
import edu.scdx.demo.service.UserService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private SendVerificationCodeService sendService;

    @Resource
    private UserService userService;

    /**
     * 找回密码
     * @param email
     * @return
     */
    @RequestMapping("/sendEmail/ToRetrievePassword")
    @ResponseBody
    public Object sendEmailToRetrievePassword(String email){
        if(sendService.ifHasRegister(email)){
            return Result.error("该邮箱未注册");
        }else {
            try {
                return Result.success(sendService.sendMail(email).get(1));
            }catch (Exception e){
                return  Result.error("邮件发送失败");
            }

        }

    }

    @RequestMapping("/retrievePassword")
    @ResponseBody
    public Object retrievePassword(User user){
        if (userService.changePasswordByEmail(user)){
            return Result.success();
        }else {
            return Result.error("更改密码失败");
        }


    }
}