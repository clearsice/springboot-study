package com.f.springboot20.controller;

import com.f.springboot20.bean.User;
import com.f.springboot20.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
@Api(tags = "用户登录与登出")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转首页（登录页）
    @GetMapping("/toIndex")
    public String show() {
        return "index";
    }

    //登录操作
    @ResponseBody
    @PostMapping("/loginUser")
    public String login(User user, HttpServletRequest request) {
        String userName = user.getUsername();
        String passWord = user.getPassword();

        System.out.println(userName);
        System.out.println(passWord);

        User u1 = userService.login(userName, passWord);
        if (u1 == null) {
            return "用户名或密码错误";
        } else {
            request.getSession().setAttribute("session_user", user);//登录成功后将用户放入session中，用于拦截
            return "登录成功";
        }
    }

    //跳转注册页
    @GetMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    //注册操作
    @PostMapping("/register")
    public String register(User user) {
        int su = userService.register(user);
        if (su == 0) {
            System.out.println("----");
        }
        return "welcome";
    }

    //测试未登陆拦截页面
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    //退出登录
    @GetMapping("/outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("session_user");
        response.sendRedirect("/user/toIndex");
    }
}
