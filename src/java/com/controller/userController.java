package com.controller;

import com.entity.User;
import com.service.Impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("user")
public class userController {
    @Resource(name = "buser")
    private UserService userService;
    @RequestMapping("/login")
    public String login(String username, String password, Model model){
        User user=userService.login(username,password);
        if(user!=null){
            model.addAttribute("msg","登入成功");
            return "inlogin";
        }
        else {
            model.addAttribute("msg","登入失败");
            return "login";
        }

    }
}
