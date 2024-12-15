package com.xworkz.xworkzcourse.registeration.service;

import com.xworkz.xworkzcourse.registeration.dto.CourseRegistrationDto;

public interface CourseRegistrationService {

    String validate (CourseRegistrationDto dto);
    String getNameByEmailAndPassword(String email,String password);
}
