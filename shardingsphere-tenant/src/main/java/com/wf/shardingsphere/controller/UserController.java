package com.wf.shardingsphere.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：wf
 * @Date ：2020/6/2 13:59
 * @Describe：用户
 */
@RestController
@RequestMapping("user/")
public class UserController {

    /**
     * 用户登录 默认访问平台库
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return  "";
    }
}
