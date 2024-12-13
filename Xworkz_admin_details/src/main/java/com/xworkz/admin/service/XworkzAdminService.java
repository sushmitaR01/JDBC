package com.xworkz.admin.service;

import com.xworkz.admin.dto.XworkzAdminDto;
import org.springframework.stereotype.Service;

@Service
public interface XworkzAdminService {

    boolean validateAndSave(XworkzAdminDto dto);

}
