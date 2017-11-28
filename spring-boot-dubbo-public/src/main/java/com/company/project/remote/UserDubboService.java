package com.company.project.remote;


import com.company.project.module.SysUser;

/**
 * Created by localadmin on 2017/11/28.
 */
public interface UserDubboService {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    SysUser findUserByName(String userName);
}
