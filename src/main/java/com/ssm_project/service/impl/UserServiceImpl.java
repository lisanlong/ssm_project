package com.ssm_project.service.impl;

import com.ssm_project.dao.UserMapper;
import com.ssm_project.entity.User;
import com.ssm_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public int insert(User record) {
        return userMapper.insert(record);
    }
}
