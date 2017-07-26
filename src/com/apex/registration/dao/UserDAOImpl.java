package com.apex.registration.dao;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

//import com.apex.registration.dbaccess.RegistrationDBAccess;
import com.apex.registration.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	
	

	@Override
	public void registerUser(User user) throws Exception {
		System.out.println("UserDAOImpl:registerUser(User user)-- start");
		
		
		// db code
		
		Connection dbConn = null;
	    PreparedStatement pStmt = null;
	    int rowsInserted = 0;
	    
	    System.out.println("Printing while in DB: Firstname "+user.getFirstName()+" Last Name : "+user.getLastName());
	     try{
		dbConn = getConnection();
		pStmt = dbConn.prepareStatement("INSERT INTO person (firstname, lastname, gender, address,city,state,country,phonenumber,bankname,accountNumber,ssn) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
		
		
		//pStmt.setInt(1,);
		pStmt.setString(1, user.getFirstName());
		pStmt.setString(2, user.getLastName());
		pStmt.setString(3, user.getGender());
		pStmt.setString(4, user.getAddress());
		pStmt.setString(5, user.getCity());
		pStmt.setString(6, user.getState());
		pStmt.setString(7, user.getCountry());
		pStmt.setString(8, user.getPhone());
		pStmt.setString(9, user.getBankName());
		pStmt.setString(10, user.getAccountNumber());
		pStmt.setString(11, user.getSsn());
		
		
		
  		rowsInserted = pStmt.executeUpdate();

		if (rowsInserted != 1) {
			throw new Exception("Error in inserting the row");

  		}
	     	}catch (SQLException sqle) {
		   sqle.printStackTrace();
		   throw sqle;
		}catch(Exception e) {
		   e.printStackTrace();
		   throw e;
		}
	     finally {
		pStmt.close();
		dbConn.close();
		System.out.println("Number of rows Inserted:  "+rowsInserted);
	     }
	     
	     System.out.println("UserDAOImpl:registerUser(User user)-- end");
		return;
		
		
//		try {
//			RegistrationDBAccess.registerUser(user);
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//		}
		
		
	}

	@Override
	public User getUser(int userID) {
		
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userID) {
		// TODO Auto-generated method stub
		
	}
	
	public static Connection getConnection() throws Exception{
		
		Connection dbConn = null;
		try{
			
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.jdbc.Driver");
			dbConn = DriverManager.getConnection(url, "root", "root");
		}
		
		catch (SQLException sqle) {
			
			sqle.printStackTrace();
			throw sqle;
		}
         catch(Exception e) {
        	 
        	 e.printStackTrace();
        	 throw e;
        	 
         	}
		return dbConn;
	}

}
