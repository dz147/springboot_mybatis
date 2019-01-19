package com.nf147.platform.controller;

import com.nf147.platform.entity.User;
import com.nf147.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService user;

    @RequestMapping("/getuser")
    public @ResponseBody List<User> getUser() {
        return user.selectAll();
    }

    @RequestMapping("/index")
    public String home() {
        return "home";
    }

}
