package com.xworkz.admin.controller;

import com.xworkz.admin.dto.XworkzAdminDto;
import com.xworkz.admin.service.XworkzAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class XworkzAdminController {
    @Autowired
    private XworkzAdminService xworkzAdminService;
    @Autowired
    XworkzAdminService XworkzAdminService;
    public XworkzAdminController() {
        System.out.println("Running in a XworkzAdminController");
    }




        @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
        public String xworkzController(XworkzAdminDto dto, Model model) {
            System.out.println("xworkz controller method");
            if (xworkzAdminService.validateAndSave(dto)) {
                System.out.println("login successful");
                model.addAttribute("Successmessage", "User Login is Success");
                return "Success.jsp";
            } else {
                System.err.println("login cancel");
                model.addAttribute("msg", "Login Cancel!");
                model.addAttribute("message", dto);
                return "Login.jsp";
            }
        }

    }



//
