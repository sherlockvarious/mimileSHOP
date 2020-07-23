package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.User;
import edu.scdx.demo.service.GoodService;
import edu.scdx.demo.service.ManagerService;
import edu.scdx.demo.service.SendVerificationCodeService;
import edu.scdx.demo.service.UserService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private GoodService goodService;

    @Resource
    private ManagerService managerService;
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

    @GetMapping("/displaygoods")
    @ResponseBody
    /** 商品列表*/
    public Object getGoods(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(goodService.findGoods(pageNo,pageSize));
    }

    @GetMapping("/showgoods")
    public String toGoodListPage(){

        return "views/good/showgood-list";
    }

    @RequestMapping("/searchgood")
    @ResponseBody
    public Object getGood(@RequestBody int Goodsid){
        Goods good = goodService.getGood(Goodsid);
        return Result.success(good);
    }

    @RequestMapping("/searchgoodbytype")
    @ResponseBody
    public Object searchGoodsByType(@RequestBody String type){
        List<Goods> goods = goodService.searchByType(type);
        return Result.success(goods);
    }

    @RequestMapping("/searchgoodbybrand")
    @ResponseBody
    public Object searchGoodsByBrand(@RequestBody String brand){
        List<Goods> goods = goodService.searchByBrand(brand);
        return Result.success(goods);
    }
}