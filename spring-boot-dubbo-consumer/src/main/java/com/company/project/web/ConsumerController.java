package com.company.project.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.company.project.module.SysUser;
import com.company.project.remote.UserDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by localadmin on 2017/11/28.
 */
@Controller
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private UserDubboService userDubboService;

    @RequestMapping("/findUserByUserName")
    @ResponseBody
    public SysUser findUserByUserName(HttpServletRequest request, HttpServletResponse response, String userName){
        return userDubboService.findUserByName(userName);
    }

}
