package com.cf.cloud.auth.other.service.impl;

import com.cf.cloud.auth.other.dao.UserDao;
import com.cf.cloud.auth.other.domain.SysUser;
import com.cf.cloud.auth.other.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
