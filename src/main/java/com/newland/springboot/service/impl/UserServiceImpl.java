package com.newland.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newland.springboot.domain.User;
import com.newland.springboot.mapper.UserMapper;
import com.newland.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by newland on 2018/4/10.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> getUsers(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.selectAll();
        PageInfo pageInfo = new PageInfo<>(userList,5);
        return pageInfo;
    }
}
