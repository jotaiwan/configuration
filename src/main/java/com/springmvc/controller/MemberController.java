package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 29/07/2017.
 */
@Controller
public class MemberController {
    @RequestMapping("/members")
    public String members() {
        return "members";
    }
}
