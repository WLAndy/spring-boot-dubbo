package com.company.project.dubbo.impl;
import com.company.project.module.SysUser;
import com.company.project.remote.UserDubboService;
import com.company.project.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by localadmin on 2017/11/28.
 */
@Service("userDubboService")
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 根据用户名查找用户
     *
     * @param userName
     * @return
     */
    @Override
    public SysUser findUserByName(String userName) {
        com.company.project.model.SysUser user = sysUserService.findBy("username",userName);
        SysUser sysUser = new SysUser();
        if (user != null){
            BeanUtils.copyProperties(user,sysUser);
        }
        return sysUser;
    }
}
