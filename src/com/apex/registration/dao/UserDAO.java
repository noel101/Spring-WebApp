package com.apex.registration.dao;

import com.apex.registration.vo.User;

public interface UserDAO {
	
	public void registerUser(User user) throws Exception;
	public User getUser(int userID);
	void updateUser(User user);
	void deleteUser(int userID);


}
