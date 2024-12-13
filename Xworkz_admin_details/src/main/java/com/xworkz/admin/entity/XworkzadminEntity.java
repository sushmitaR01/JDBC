package com.xworkz.admin.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="xworkzz_table")
@Data
@RequiredArgsConstructor
public class XworkzadminEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Integer age;
    private  String email;
    private  String password;
    private  String conformPassword;
    private String phoneNo;

}
