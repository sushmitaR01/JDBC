package com.xworkz.train.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.enumerator.TrainEnum;

public class TrainRepoImpl implements TrainRepo{

	@Override
	public boolean save(TrainDto dto) {
		boolean ans=false;
		Connection connection=null;
		PreparedStatement prst=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

		try {
			connection=DriverManager.getConnection(TrainEnum.URL.getvalue(),TrainEnum.USERNAME.getvalue(),TrainEnum.PASSWORD.getvalue());
			prst=connection.prepareStatement("insert into train values(?,?,?,?,?)");
			prst.setString(1, dto.getName());
			prst.setString(2, dto.getAge());
			prst.setString(3, dto.getPhone());
			prst.setString(4, dto.getAddress());
			prst.setString(5, dto.getEmail());
			
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
