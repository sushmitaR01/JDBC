package com.xworkz.contact.service;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.repo.ContactRepoImpl;

public class ContactServiceImpl implements ContactService {

	@Override
	public boolean save(ContactDTO contactDTO) {
		boolean verify = true;
		if (contactDTO != null) {

			String name = contactDTO.getName();
			if (name == null && name.length() < 3 && name.length() > 14) {
				System.out.println("In-Valid User Name");
				verify = false;
			}
			String mobno = contactDTO.getMobno();

			if (!(mobno.length() == 10 && mobno.startsWith("9"))) {
				System.out.println("In-Valid Phone Number");
				verify = false;
			}

			String email = contactDTO.getEmail();
			if (email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@') == 8)) {
				System.out.println("In-Valid Email");
				verify = false;
			}

			int age = contactDTO.getAge();
			if (age < 19) {
				System.out.println("In-Valid Age");
				verify = false;
			}
		}
		if (verify) {
			ContactRepoImpl contactRepoImpl = new ContactRepoImpl();
			boolean isSaved = contactRepoImpl.save(contactDTO);

		}

		return verify;
	}

}
