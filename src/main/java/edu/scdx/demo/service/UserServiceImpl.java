package edu.scdx.demo.service;


import edu.scdx.demo.dao.UserMapper;
import edu.scdx.demo.entity.User;
import edu.scdx.demo.entity.UserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User userLogin(User user) {

        UserExample example = new UserExample();
        example.createCriteria().andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());

        List<User> userList = new ArrayList<>();
        userList = userMapper.selectByExample(example);

        if (userList.size() != 0) {
            User one = userList.get(0);
            Date date = new Date();
            one.setLastLoginTime(date);

            return one;

        }
        return null;


    }

    /**
     * 通过主键更新数据库
     * @param user
     * @return
     */
    @Override
    public boolean update(User user) {
        try {
            userMapper.updateByPrimaryKey(user);
        }catch(Exception e){
            return false;
        }

        return true;
    }

    //获取客户端IP地址
    @Override
    public String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknow".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length () == 0 || "unknown".equalsIgnoreCase (ip)) {
            ip = request.getHeader ("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length () == 0 || "unknown".equalsIgnoreCase (ip)) {
            ip = request.getRemoteAddr ();
            if (ip.equals ("127.0.0.1")) {
                //根据网卡取本机配置的IP
                InetAddress inet = null;
                try {
                    inet = InetAddress.getLocalHost ();
                } catch (Exception e) {
                    e.printStackTrace ();
                }
                ip = inet.getHostAddress ();
            }
        }
        // 多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if (ip != null && ip.length () > 15) {
            if (ip.indexOf (",") > 0) {
                ip = ip.substring (0, ip.indexOf (","));
            }
        }
        return ip;

    }


    /**
     * 通过邮箱更改数据库密码
     * @param user
     * @return
     */
    @Override
    public boolean changePasswordByEmail(User user) {

        try {
            UserExample example = new UserExample();
            example.createCriteria().andEmailEqualTo(user.getEmail());

            userMapper.updateByExampleSelective(user,example);

            return true;
        }catch (Exception e){
            return  false;
        }

    }
}