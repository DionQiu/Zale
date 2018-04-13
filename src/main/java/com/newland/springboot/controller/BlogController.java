package com.newland.springboot.controller;

import com.newland.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IUserService userService;



    @GetMapping("search")
    @ResponseBody
    public String  doSearch(String  keyword) {


        return keyword;
    }




}  