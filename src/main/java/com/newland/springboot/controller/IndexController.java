package com.newland.springboot.controller;

import com.github.pagehelper.PageInfo;
import com.newland.springboot.domain.User;
import com.newland.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/", method = {RequestMethod.HEAD, RequestMethod.GET})
    public String home() {
        return "index";
    }

    @GetMapping("/users")
    @ResponseBody
    public PageInfo<User> getUsers(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageNum", defaultValue = "1") int pageSize) {
        //使用分页插件,核心代码就这一

        return userService.getUsers(pageNum, pageSize);
    }




}  