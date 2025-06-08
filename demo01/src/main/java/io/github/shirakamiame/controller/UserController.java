package io.github.shirakamiame.controller;

import io.github.shirakamiame.entity.User;
import io.github.shirakamiame.service.UserService;
import io.github.shirakamiame.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = {"/","/login.html"})
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    @ResponseBody
    public R<User> login(@RequestBody User user, Model model){
        String password= DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        User login = userService.login(user.getUsername());
        if(user==null){
            return R.error("用户名错误");
        }
        if(!login.getPassword().equals(password)){
            return R.error("密码错误");
        }
        if (user.getStatus()==0){
            return R.error("用户被禁用");
        }
       return R.success(login);
    }
}
