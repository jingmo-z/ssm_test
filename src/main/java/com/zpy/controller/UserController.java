package com.zpy.controller;

import com.zpy.domain.User;
import com.zpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zpy
 */
@Controller
@CrossOrigin
public class UserController {

    /*
    没有@SessionAttributes注解时Model、ModelMap、ModelAndView存数据默认往请求域中存
    使用此注解修饰后会想请求域和会话域中存储
    @SessionAttribute注释是从会话域中取值
     */

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findAll();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    @RequestMapping(value = "/save", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(User user) {
        userService.save(user);
        return "保存成功";
    }

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login() {
        return "登录成功";
    }
}
