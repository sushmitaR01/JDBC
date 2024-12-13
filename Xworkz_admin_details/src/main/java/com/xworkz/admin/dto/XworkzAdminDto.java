package com.xworkz.admin.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class XworkzAdminDto {
    private Integer id;
    private String name;
    private Integer age;
    private  String email;
    private  String password;
    private  String conformPassword;
    private String phoneNo;


}
