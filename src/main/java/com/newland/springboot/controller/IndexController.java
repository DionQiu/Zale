package com.newland.springboot.controller;
  
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newland.springboot.domain.User;
import com.newland.springboot.domain.UserExample;
import com.newland.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  
public class IndexController {

    @Autowired
    private UserMapper userMapper;
  
    @RequestMapping(value = "/",method = {RequestMethod.HEAD,RequestMethod.GET})
    public String home() {  
        return "Hello World!";  
    }

    @GetMapping("/users")
    public PageInfo<User> getUsers(@RequestParam(value = "pageNum",defaultValue="1") int pageNum,@RequestParam(value = "pageNum",defaultValue="1") int pageSize) {
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userMapper.selectByExample(new UserExample());
        PageInfo pageInfo = new PageInfo<>(userList,5);

        return pageInfo;
    }

}  