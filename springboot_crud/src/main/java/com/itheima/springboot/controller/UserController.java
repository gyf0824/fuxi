package com.itheima.springboot.controller;

import com.itheima.springboot.pojo.User;
import com.itheima.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public Map findAll(){
        List<User> userList = userService.findAll();
        Map result = new HashMap();
        result.put("status",200);
        result.put("message","查询全部成功");
        result.put("data",userList);
        return result;
    }

    @GetMapping("/{id}")
    public Map findById(@PathVariable("id") Integer id){
        User user = userService.findById(id);
        Map result = new HashMap();
        result.put("status",200);
        result.put("message","根据主键id查询成功");
        result.put("data",user);
        return result;
    }

    @PostMapping
    public Map save(@RequestBody User user){
        userService.save(user);
        Map result = new HashMap();
        result.put("status",200);
        result.put("message","保存成功");
        return result;
    }

    @DeleteMapping("/{id}")
    public Map delete(@PathVariable("id") Integer id){
        userService.delete(id);
        Map result = new HashMap();
        result.put("status",200);
        result.put("message","根据主键id删除成功");
        return result;
    }

    @PutMapping
    public Map update(@RequestBody User user){
        userService.update(user);
        Map result = new HashMap();
        result.put("status",200);
        result.put("message","根据主键id修改成功");
        return result;
    }
}
