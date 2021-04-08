package com.cloud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/user/login")
    // @RequestParam注解将请求参数绑定到你控制器的方法参数上
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session){
        //具体业务：
        if ((!StringUtils.isEmpty(username)) &&"123456".equals(password)){
            session.setAttribute("loginUser",username);
        return "redirect:/main.html";

        }else {
        //告诉用户，登录失败了
            model.addAttribute("msg","用户名密码错误！");
            return "index";
        }
    }
    @GetMapping("/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
