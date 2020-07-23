package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.Orders;
import edu.scdx.demo.service.GoodService;
import edu.scdx.demo.service.ManagerService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.*;
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
    public Object getGoods(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10")int limit){
        return Result.success(goodService.findGoods(page,limit),"分页 查询good 对象");
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

    @RequestMapping("/insertgood")
    @ResponseBody
    public Object insertGoods(Goods good) {
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        File upload = new File(path+"/static/image/");
        if(!upload.exists()) upload.mkdirs();
        String filepath = path+"/static/image/"+good.getGoodsName()+".jpg";
        File imgFile = new File(filepath);
        try {
            saveImage(new ByteArrayInputStream(good.getGoodsPic().getBytes("ISO-8859-1")), imgFile);
            good.setGoodsPic( "/image/"+good.getGoodsName()+".jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
        goodService.insertGoods(good);
        return Result.success(good.getGoodsId());
    }

    public static void saveImage(InputStream ins, File file) throws IOException {
        OutputStream os = new FileOutputStream(file);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        ins.close();
    }

    @DeleteMapping("/deletegoods")
    @ResponseBody
    public Object deleteGoods(@RequestBody List<Integer> ids){
        goodService.deleteGoodsByIds(ids);
        return Result.success();
    }

    @RequestMapping("/updategood")
    @ResponseBody
    public Object updateGoods(@RequestBody Goods good){
        goodService.updateGood(good);
        return Result.success();
    }

    @DeleteMapping("/searchgood")
    @ResponseBody
    public Object getGood(@RequestBody int Goodsid){
        Goods good = goodService.getGood(Goodsid);
        return Result.success(good);
    }

    @RequestMapping("/check/sendedOrder")
    @ResponseBody
    public Object checkSendedOrder(@RequestParam(defaultValue = "1") int page,  @RequestParam(defaultValue = "10")int limit){

        return Result.success(managerService.checkSendedOrder(page,limit),"成功接收数据",200);

    }

    @RequestMapping("/waitToSend")
    @ResponseBody
    public Object waitToSend(@RequestParam(defaultValue = "1") int page,  @RequestParam(defaultValue = "10")int limit){
        return Result.success(managerService.waitToSend(page,limit),"成功接收数据",200);
    }

    @RequestMapping("/toDelivery")
    @ResponseBody
    public Object toDelivery(int orderId){
        managerService.toDelivery(orderId);
        return Result.success();
    }

    @RequestMapping("/manageCoupon")
    @ResponseBody
    public Object manageCoupon(@RequestParam(defaultValue = "1") int page,  @RequestParam(defaultValue = "10")int limit){
        return Result.success( managerService.viewCoupon(page ,limit),"成功接收数据",200);
    }

}


