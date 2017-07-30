package com.springmvc.controller;

import com.springmvc.data.entity.Employee;
import com.springmvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jotaiwan on 30/07/2017.
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/employees")
    public String employees(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        model.addAttribute("total", employees.size());
        return "employees";
    }
}
