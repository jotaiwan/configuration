package com.springmvc.controller;

import com.springmvc.data.entity.Member;
import com.springmvc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jotaiwan on 29/07/2017.
 */
@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping("/members")
    public Model members(Model model) {
        List<Member> allMembers = memberService.findAll();
        model.addAttribute("members", allMembers);
        model.addAttribute("total", allMembers.size());
        return model;
    }
}
