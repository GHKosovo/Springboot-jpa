package com.llj.springbootjap.controller;

import com.llj.springbootjap.entity.User;
import com.llj.springbootjap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String HomePage(){
        return "index";
    }

    @RequestMapping("/add")
    public User addUser(@RequestParam("id")Integer id,
                        @RequestParam("name")String name,
                        @RequestParam("sex")String sex,
                        @RequestParam("birth")String birth){
        User user = new User(id, name, sex, birth);
        return user;
    }

    @GetMapping("/get")
    public String getUser(@RequestParam(value="id",defaultValue = "1")Integer id, Model model){
        User user = userService.getUser(id);
        user.getName();
        System.out.printf(
                "id:"+user.getId()+"\n"+
                "username:"+user.getName()+"\n"+
                "usersex:"+user.getSex()+"\n"+
                "userbirth:"+user.getBirth()+"\n");
        model.addAttribute("user",user.toString());
        return "index";
    }
}
