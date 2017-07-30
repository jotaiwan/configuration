package com.springmvc.controller;

import com.springmvc.data.dto.LoginDto;
import com.springmvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jotaiwan on 29/07/2017.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/loginManager")
    public String loginManager(Model model) {
        List<LoginDto> logins = loginService.findAll();
        model.addAttribute("logins", logins);
        return "loginManager";
    }
}
