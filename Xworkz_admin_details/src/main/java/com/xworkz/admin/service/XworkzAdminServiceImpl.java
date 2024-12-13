package com.xworkz.admin.service;

import com.xworkz.admin.dto.XworkzAdminDto;
import com.xworkz.admin.entity.XworkzadminEntity;
import com.xworkz.admin.repository.XworkzAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XworkzAdminServiceImpl implements  XworkzAdminService {
    @Autowired
    private XworkzAdminRepository xworkzAdminRepository;

    @Override
    public boolean validateAndSave(XworkzAdminDto dto) {


        if (dto.getName() == null || dto.getName().length() < 10) {
            System.out.printf("name is invalid");
            return false;
        }


        if (dto.getAge() == null || dto.getAge() <= 18) {
            System.out.printf("age is invalid");
            return false;
        }


        if (dto.getPassword() == null || dto.getPassword().length() < 7 || !dto.getPassword().equals(dto.getConformPassword())) {
            System.out.printf("password is invalid");
            return false;
        }


        if (dto.getEmail() == null || !dto.getEmail().contains("@") || !dto.getEmail().endsWith("gmail.com")) {
            System.out.printf("email is invalid");
            return false;
        }


        if (dto.getPhoneNo() == null || dto.getPhoneNo().toString().length() != 10 || !dto.getPhoneNo().toString().startsWith("9")) {
            System.out.printf("phone is invalid");
            return false;
        }


        XworkzadminEntity entity = new XworkzadminEntity();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setConformPassword(dto.getConformPassword());
        entity.setPhoneNo(dto.getPhoneNo());

        xworkzAdminRepository.validateAndSave(entity);
        System.out.println("entity is:" + entity.toString());





        return true;

    }
}

