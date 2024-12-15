package com.xworkz.xworkzcourse.registeration.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="course_details_table")
@Data


@RequiredArgsConstructor
@NamedQuery(name="getNameByEmailAndPassword" ,query="select ce.name from CourseRegistrationEntity ce where ce.email =:byEmail and ce.password =:byPassword")
public class CourseRegistrationEntity {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String email;
    private String password;
    private String confirmPassword;
    private long phone;
}
