package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.service.GoodService;
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

    @DeleteMapping("/deletegoods")
    @ResponseBody
    public Object deleteGoods(@RequestBody List<Integer> ids){
        goodService.deleteGoodsByIds(ids);
        return Result.success();
    }
}


