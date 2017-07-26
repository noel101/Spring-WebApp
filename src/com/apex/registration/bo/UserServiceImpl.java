package com.apex.registration.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.registration.dao.UserDAO;
import com.apex.registration.vo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO =null;
	@Override
	public void registerUser(User user) {
		
		System.out.println("UserServiceImpl:registerUser(User user)-- start");
		try {
			userDAO.registerUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UserServiceImpl:registerUser(User user)-- end");
	}

//	@Override
//	public User getUser(int userID) {
//		
//		return null;
//	}
//
//	@Override
//	public void updateUser(User user) {
//		
//		
//	}
//
//	@Override
//	public void deleteUser(int userID) {
//		// TODO Auto-generated method stub
//		
//	}

}
