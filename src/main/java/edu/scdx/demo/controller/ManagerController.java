package edu.scdx.demo.controller;

import com.github.pagehelper.PageInfo;
import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.Order;
import edu.scdx.demo.service.GoodService;
import edu.scdx.demo.service.ManagerService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {


    @Resource
    private GoodService goodService;

    @Resource
    private ManagerService managerService;

    @GetMapping("/getgoods")
    @ResponseBody
    /** 对商品的管理*/
    public Object getGoods(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10")int pageSize){
        return Result.success(goodService.findGoods(pageNo,pageSize),"分页 查询good 对象");
    }

    @GetMapping("/listgoods")
    public String toGoodListPage(){

        return "/views/good/good-list";
    }

    @DeleteMapping("/deletegood")
    @ResponseBody
    public Object deleteGood(@RequestBody Goods good){
        goodService.deleteGoodById(good);
        return Result.success(good.getGoodsId());
    }

    @RequestMapping("/user")
    @ResponseBody
    public Object insertGoods(Goods good) {
        goodService.insertGoods(good);
        return Result.success(good.getGoodsId());
    }

    @DeleteMapping("/deletegoods")
    @ResponseBody
    public Object deleteGoods(@RequestBody List<Integer> ids){
        goodService.deleteGoodsByIds(ids);
        return Result.success();
    }

    @RequestMapping("/check/sendedOrder")
    @ResponseBody
    public Object checkSendedOrder(@RequestParam(defaultValue = "1") int page,  @RequestParam(defaultValue = "10")int limit){

        return Result.success(managerService.checkSendedOrder(page,limit),"成功接收数据",200);

    }

}


