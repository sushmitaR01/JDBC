package com.xworkz.admin.repository;

import com.xworkz.admin.entity.XworkzadminEntity;

public interface XworkzAdminRepository {

    boolean validateAndSave(XworkzadminEntity entity);
}
