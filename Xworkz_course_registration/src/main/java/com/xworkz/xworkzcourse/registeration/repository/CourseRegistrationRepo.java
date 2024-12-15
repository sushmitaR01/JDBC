package com.xworkz.xworkzcourse.registeration.repository;

import com.xworkz.xworkzcourse.registeration.entity.CourseRegistrationEntity;

public interface CourseRegistrationRepo {

    boolean save(CourseRegistrationEntity entity);
    String getNameByEmailAndPassword(String email,String password);


}
