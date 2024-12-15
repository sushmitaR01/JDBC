package com.xworkz.xworkzcourse.registeration.service;

import com.xworkz.xworkzcourse.registeration.dto.CourseRegistrationDto;
import com.xworkz.xworkzcourse.registeration.entity.CourseRegistrationEntity;
import com.xworkz.xworkzcourse.registeration.repository.CourseRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRegistrationServiceImpl implements CourseRegistrationService {
    @Autowired
    private CourseRegistrationRepo courseRegistrationRepo;

    @Override
    public String validate(CourseRegistrationDto dto) {

        System.out.println("data in serviceImpl====" + courseRegistrationRepo);

        boolean valid = true;
        if (dto != null) {
            String name = dto.getName();
            String email = dto.getEmail();
            int age = dto.getAge();
            String password = dto.getPassword();
            String confirmPassword = dto.getConfirmPassword();
            long phoneNumber = dto.getPhone();
            String ph = String.valueOf(phoneNumber);
            if (name != null && name.length() >= 10) {
                System.out.println("name is valid");
                if (email != null && email.contains("@") && email.contains("gmail.com")) {
                    System.out.println("email is valid");
                    if (age > 18) {
                        System.out.println("age is valid");
                        int specialCharCount = 0;
                        for (char c : password.toCharArray()) {
                            if (!Character.isLetterOrDigit(c)) {
                                specialCharCount++;
                            }
                        }
                        if (password != null && password.length() == 9 && specialCharCount == 2) {
                            System.out.println("valid password");
                            if (confirmPassword.equals(password)) {
                                System.out.println("confirm password is same as password");

                                if (ph.length() == 10 && ph.startsWith("9")) {
                                    System.out.println("valid phoneNumber");
                                    CourseRegistrationEntity entity = new CourseRegistrationEntity();
                                    entity.setName(dto.getName());
                                    entity.setAge(dto.getAge());
                                    entity.setEmail(dto.getEmail());
                                    entity.setPassword(dto.getPassword());
                                    entity.setConfirmPassword(dto.getConfirmPassword());
                                    entity.setPhone(dto.getPhone());
                                    this.courseRegistrationRepo.save(entity);
                                } else {
                                    return "phone number must starts with 9";
                                }
                            } else {
                                return "confirm password is not matching to password";
                            }
                        } else {
                            return "password must contains 9 letters";
                        }
                    } else {
                        return "age must be greater than 18";
                    }
                } else {
                    return "email must contains @Gmail.com";
                }
            } else {
                return "Name length must be greater than 10";
            }

        }


        return "SignUp is successfull";
    }

    @Override
    public String getNameByEmailAndPassword(String email, String password) {
        String name = courseRegistrationRepo.getNameByEmailAndPassword(email, password);
        return name;
    }


}






