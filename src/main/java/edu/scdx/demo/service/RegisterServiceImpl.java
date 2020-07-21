package edu.scdx.demo.service;

import edu.scdx.demo.dao.UserMapper;
import edu.scdx.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */


@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    UserMapper userMapper;


    /**
     * 注册用户
     * @param user
     * @return
     */
    @Override
    public boolean registerUser(User user){
        if (userMapper.insertSelective(user)==1){
            return true;
        }
        return false;

    }


}