package com.xworkz.xworkzcourse.registeration.controller;

import com.xworkz.xworkzcourse.registeration.dto.CourseRegistrationDto;
import com.xworkz.xworkzcourse.registeration.service.CourseRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class CourseRegistrationController {


        @Autowired
        CourseRegistrationService service;

      public  CourseRegistrationController(){
            System.out.println("created CourseRegistrationController");
        }

        @PostMapping("/save")
        public String onSave(Model model, CourseRegistrationDto dto){
            System.out.println(dto.toString());

            String valid= service.validate(dto);
            model.addAttribute("msg",valid);



            return "SignUp.jsp";
        }
        @PostMapping("/send")
        public String onSearch(@RequestParam String email, @RequestParam String password, Model model){

            String valid= service.getNameByEmailAndPassword(email,password);
            model.addAttribute("msg",valid);



            return "Signin.jsp";
        }

    }
