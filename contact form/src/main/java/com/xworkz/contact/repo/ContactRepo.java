package com.xworkz.contact.repo;

import com.xworkz.contact.dto.ContactDTO;

public interface ContactRepo {
 boolean save(ContactDTO contactDTO);
}
