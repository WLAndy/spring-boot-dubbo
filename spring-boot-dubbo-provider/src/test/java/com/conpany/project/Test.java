package com.conpany.project;

import com.company.project.module.SysUser;
import com.company.project.remote.UserDubboService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by HZC-PC on 2017/11/28.
 */
public class Test extends Tester {

    @Autowired
    private UserDubboService userDubboService;

    @org.junit.Test
    public void test(){
        SysUser sysUser = userDubboService.findUserByName("admin");
        System.err.print(sysUser);
    }
}
