package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author dell
 */
@Controller
public class LoginController {

    /**
     * 处理登入请求
     */
    @RequestMapping("/user/login")
    public String login(@RequestParam("myUserName") String uName,
            @RequestParam("myPassword") String password,
            Model model, HttpSession session) {

        if (!StringUtils.isEmpty(uName) && "666".equals(password)) {

            //增加一个属性记录，可以用来作为拦截判断，以及后续信息展示
            session.setAttribute("loginUser", uName);
            //重定向至main页面，然后通过自定义ViewController使main路径实际上跳转到index页面
            return "redirect:/main";
        } else {
            model.addAttribute("msg", "用户名或者密码错误");
            return "index";
        }
    }
}
