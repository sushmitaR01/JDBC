package com.xworkz.xworkzcourse.registeration.dto;

import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data


@RequiredArgsConstructor

public class CourseRegistrationDto {
        private int id;
        private String name;
        private int age;
        private String email;
        private String password;
        private String confirmPassword;
        private long phone;
}
