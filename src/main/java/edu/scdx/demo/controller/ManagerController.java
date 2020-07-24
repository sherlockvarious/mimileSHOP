package edu.scdx.demo.controller;

import edu.scdx.demo.entity.Coupon;
import edu.scdx.demo.entity.Goods;
import edu.scdx.demo.entity.ManagerRecord;
import edu.scdx.demo.entity.Orders;
import edu.scdx.demo.entity.Manager;
import edu.scdx.demo.service.GoodService;
import edu.scdx.demo.service.ManagerService;
import edu.scdx.demo.service.RecordService;
import edu.scdx.demo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.*;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/manager")
public class ManagerController {


    @Resource
    private GoodService goodService;

    @Resource
    private ManagerService managerService;

    @Resource
    private RecordService recordService;

    @GetMapping("/getgoods")
    @ResponseBody
    /** 对商品的管理*/
    public Object getGoods(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10")int limit){
        return Result.success(goodService.findGoods(page,limit));
    }

    @GetMapping("/listgoods")
    public String toGoodListPage() {

        return "views/good/good-list";
    }

    @DeleteMapping("/deletegood")
    @ResponseBody
    public Object deleteGood(Goods good,int managerId ) {

        Goods old = recordService.selectGoods(good);

        try {
            String detail = "管理员"+managerId+"删除了商品:"+old.toString();

            ManagerRecord record = new ManagerRecord();
            record.setManagerId(managerId);
            record.setDetail(detail);
            record.setTime(new Date());

            recordService.addRecord(record);

        }catch (Exception e){
            e.printStackTrace();
        }

        goodService.deleteGoodById(good);
        return Result.success(good.getGoodsId());
    }

    @RequestMapping("/insertgood")
    @ResponseBody
    public Object insertGoods(Goods good,int managerId) {
        if(good.getGoodsPic() != ""){
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
        }

        //写入record
        try {
            String detail = "管理员"+managerId+"添加了商品:"+good.toString();

            ManagerRecord record = new ManagerRecord();
            record.setManagerId(managerId);
            record.setDetail(detail);
            record.setTime(new Date());

            recordService.addRecord(record);

        }catch (Exception e){
            e.printStackTrace();
        }

        goodService.insertGoods(good);
        return Result.success();
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


    @RequestMapping("/updategood")
    @ResponseBody
    public Object updateGoods(Goods good, String imageData,int managerId) {

        Goods old = recordService.selectGoods(good);

        if(imageData!=""){
            String path = ClassUtils.getDefaultClassLoader().getResource("").getPath();
            File upload = new File(path+"/static/image/");
            if(!upload.exists()) upload.mkdirs();
            String filepath = path+"/static/image/"+good.getGoodsName()+".jpg";
            File imgFile = new File(filepath);
            try {
                saveImage(new ByteArrayInputStream(imageData.getBytes("ISO-8859-1")), imgFile);
                good.setGoodsPic( "/image/"+good.getGoodsName()+".jpg");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            String detail = "管理员"+managerId+"修改了商品信息"+"\n"+"修改前："+old.toString()+"\n"+"修改后："+good.toString();

            ManagerRecord record = new ManagerRecord();
            record.setManagerId(managerId);
            record.setDetail(detail);
            record.setTime(new Date());

            recordService.addRecord(record);

        }catch (Exception e){
            e.printStackTrace();
        }


        goodService.updateGood(good);
        return Result.success();
    }

    @DeleteMapping("/searchgood")
    @ResponseBody
    public Object getGood(@RequestBody int Goodsid) {
        Goods good = goodService.getGood(Goodsid);
        return Result.success(good);
    }

    @RequestMapping("/check/sendedOrder")
    @ResponseBody
    public Object checkSendedOrder(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {

        return Result.success(managerService.checkSendedOrder(page, limit), "成功接收数据", 200);

    }

    @RequestMapping("/waitToSend")
    @ResponseBody
    public Object waitToSend(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        return Result.success(managerService.waitToSend(page, limit), "成功接收数据", 200);

    }

    @RequestMapping("/toDelivery")
    @ResponseBody
    public Object toDelivery(int orderId,int managerId) {

        Orders send = recordService.selectOrder(orderId);
        String detail = "管理员"+managerId+"完成了发货"+"\n"+"订单详情"+send.toString();

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(managerId);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);

        return managerService.toDelivery(orderId) ? Result.success() : Result.error("发货失败");
    }

    @RequestMapping("/manageCoupon")
    @ResponseBody
    public Object manageCoupon(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        return Result.success(managerService.viewCoupon(page, limit), "成功接收数据", 200);
    }

    @RequestMapping("/addCoupon")
    @ResponseBody
    public Object addCoupon(Coupon coupon,int managerId) {

        String detail = "管理员"+managerId+"添加了优惠券:"+coupon.toString();

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(managerId);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);


        return managerService.addCoupon(coupon) ? Result.success() : Result.error("添加失败");

    }

    @RequestMapping("/editCoupon")
    @ResponseBody
    public Object editCoupon(Coupon coupon,int managerId) {

        Coupon old = recordService.selectCoupon(coupon);

        String detail = "管理员"+managerId+"修改了优惠券:"+"修改前:"+old.toString()+"\n"+"修改后:"+coupon.toString();

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(managerId);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);


        return managerService.editCoupon(coupon) ? Result.success() : Result.error("修改失败");

    }

    @RequestMapping("/deleteCoupon")
    @ResponseBody
    public Object deleteCoupon(int couponId,int managerId){


        Coupon old = recordService.selectCouponByPrimarykey(couponId);

        String detail = "管理员"+managerId+"删除了优惠券:"+old.toString();

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(managerId);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);
        return managerService.deleteCoupon(couponId)?Result.success():Result.error("删除失败");

    }

    @GetMapping("/getmanagers")
    @ResponseBody
    /** 对商品的管理*/

    public Object getManagers(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10")int limit){
        return Result.success(managerService.findManagers(page,limit));
    }

    @GetMapping("/listmanagers")
    public String toManagerListPage() {

        return "/views/manager/manager-list";
    }

    @DeleteMapping("/deletemanager")
    @ResponseBody
    public Object deleteManager(int managerId,int who) {

        String detail = "管理员"+who+"删除了管理员"+managerId;

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(who);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);


        managerService.deleteManager(managerId);
        return Result.success();
    }

    @RequestMapping("/changePassword")
    @ResponseBody
    public Object changeManagerPassword(@RequestParam int managerId,@RequestParam String newPassword) {
        managerService.changeManagerPassword(managerId,newPassword);
        return Result.success();
    }

    @RequestMapping("/addmanager")
    @ResponseBody
    public Object addManager(Manager manager,int who) {

        String detail = "管理员"+who+"添加了管理员"+manager.getName();

        ManagerRecord record = new ManagerRecord();
        record.setManagerId(who);
        record.setDetail(detail);
        record.setTime(new Date());

        recordService.addRecord(record);
        managerService.addManager(manager);
        return Result.success(manager.getManagerId());
    }


    @RequestMapping("/getManagerRecord")
    @ResponseBody
    public Object getManagerRecord(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit){
        System.out.println("hello");
        return Result.success(managerService.findManagerRecord(page,limit),"查询成功",200);

    }
}





