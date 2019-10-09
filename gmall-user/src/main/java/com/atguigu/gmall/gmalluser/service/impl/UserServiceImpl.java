package com.atguigu.gmall.gmalluser.service.impl;

import com.atguigu.gmall.gmalluser.mapper.UserMapper;
import com.atguigu.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    UserMapper userMapper;
}
