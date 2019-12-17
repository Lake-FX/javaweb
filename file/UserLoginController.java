package com.qimo.controller;

import com.qimo.entrity.User;
import com.qimo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

/*
* 这个类实现用户登录，注册等一系列功能
 */
@Controller
public class UserLoginController {
    @Autowired
    UserService userService;

    //登录功能实现
    @RequestMapping("/login")
    public String UserLogin(User user, Map<String,Object> map, HttpSession session){
        if(user.getUsername()==null||"".equals(user.getUsername())){
            map.put("error","用户名为空");
            return "index";
        }
        if (user.getPassword()==null||"".equals(user.getPassword())){
            map.put("error","密码为空");
            return "index";
        }
        User res_user = userService.selectUser(user);
        if(res_user==null){
            map.put("error","用户名或密码错误");
            return "index";
        }else {
            return "loginSuccess";
        }

    }

    //注册功能实现
    @RequestMapping("urigister")
    public String UserRegister(User user,Map<String,Object> map){
        if(user.getUsername()==null||"".equals(user.getUsername())){
            map.put("error","注册用户名不能为空");
            return "register";
        }
        if (user.getPassword()==null||"".equals(user.getPassword())){
            map.put("error","注册密码不能为空");
            return "register";
        }
        userService.insertUser(user);
        map.put("username",user.getUsername());
        return "index";
    }

}
