package edu.scdx.demo.service;

import edu.scdx.demo.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */

public interface UserService {
    public User userLogin(User user);

    public String getIpAddress(HttpServletRequest request);

    public boolean update(User user);

    public boolean changePasswordByEmail(User user);

}
