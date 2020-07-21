package edu.scdx.demo.service;

import java.util.List;

/**
 * @author 27377-sun chao
 * @date 2020/7/21
 * @school SiChuan University
 */

public interface SendVerificationCodeService {
    public Boolean ifHasRegister(String email);

    public List<String> sendMail(String email);
}
