package com.newland.springboot.service;

import com.github.pagehelper.PageInfo;
import com.newland.springboot.domain.User;

/**
 * Created by newland on 2018/4/10.
 */
public   interface IUserService {

     PageInfo<User> getUsers(int pageNum,int pageSize);

}
