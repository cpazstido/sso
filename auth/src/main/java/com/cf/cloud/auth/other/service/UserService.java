package com.cf.cloud.auth.other.service;


import com.cf.cloud.auth.other.domain.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
