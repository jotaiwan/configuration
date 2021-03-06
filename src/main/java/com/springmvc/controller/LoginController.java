package com.springmvc.controller;

import com.springmvc.data.dto.LoginDto;
import com.springmvc.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by jotaiwan on 29/07/2017.
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping("/all")
    public String loginManager(Model model) {
        List<LoginDto> logins = loginService.findAll();
        model.addAttribute("logins", logins);

        logger.info("Total logins is {}", logins.size());
        return "loginManager";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String adminStudent(@PathVariable int id,Model model) {
        LoginDto login = loginService.findById(id);
        model.addAttribute("login", login);
        model.addAttribute("mode", "edit");
        return "loginManager";
    }

    @RequestMapping(value = "/add")
    public String add(Model model) {
        model.addAttribute("login", new LoginDto());
        model.addAttribute("mode", "add");
        return "loginManager";
    }
}
