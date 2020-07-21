package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;//控制层注入服务层

    @RequestMapping("/login")
    public String login(Manager manager){
        Manager managerInDB = managerService.login(manager);
        if(managerInDB==null){
            System.out.println("用户名不存在");
        }else {
            String passwordInDB = managerInDB.getPassword();
            if(passwordInDB.equals(manager.getPassword())){
                System.out.println("登录成功");
                return "/login";
            }else{
                System.out.println("登录失败");
            }
        }
        return "/index";
    }
}
