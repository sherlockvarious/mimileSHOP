package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.entity.User;
import edu.scdx.demo.service.ManagerService;
import edu.scdx.demo.service.UserService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */

@RequestMapping("/login")
@Controller
public class LoginController {
    @Resource
    private ManagerService managerService;//控制层注入服务层

    @Resource
    private UserService userService;//控制层注入服务层


    @RequestMapping("/manager")
    public String managerLogin(Manager manager) {
        Manager managerInDB = managerService.login(manager);
        if (managerInDB == null) {
            System.out.println("用户名不存在");
        } else {
            String passwordInDB = managerInDB.getPassword();
            if (passwordInDB.equals(manager.getPassword())) {
                System.out.println("登录成功");
                return "/login";
            } else {
                System.out.println("登录失败");
            }
        }
        return "/index";
    }


    /**
     * 用户登录
     *
     * @param user
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public Object userLogin(User user, HttpServletRequest request) {


        if (userService.userLogin(user) == null) {
            return Result.error("登陆失败 请检查用户名和密码");
        } else {
            User loginUser = userService.userLogin(user);

            loginUser.setLastLoginIp(userService.getIpAddress(request));

            if (userService.update(loginUser)) {
                return Result.success(loginUser);
            } else {
                return Result.error("登陆失败 服务器出现问题");
            }
        }


    }
}