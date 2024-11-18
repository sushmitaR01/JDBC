package com.xworkz.contact.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.enumarator.ContactEnum;

public class ContactRepoImpl implements ContactRepo{

	@Override
	public boolean save(ContactDTO contactDTO) {
		boolean ans=false;
		Connection connection=null;
		PreparedStatement prst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

		try {
			connection=DriverManager.getConnection(ContactEnum.URL.getResult(),ContactEnum.USERNAME.getResult(),ContactEnum.PASSWORD.getResult());
			prst=connection.prepareStatement("insert into  contact_table values(?,?,?,?)");
			prst.setString(1, contactDTO.getName());
			prst.setString(2, contactDTO.getMobno());
			prst.setString(3, contactDTO.getEmail());
			prst.setInt(4, contactDTO.getAge());
			
			
			int value=prst.executeUpdate();
			if(value>0)
			{
				ans=true;
				System.out.println("saved");
			}
			else
			{	ans=false;
				System.out.println("not saved");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ans;
		
}
}
