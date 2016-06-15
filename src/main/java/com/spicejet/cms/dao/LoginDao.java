package com.spicejet.cms.dao;

import com.spicejet.cms.model.Login;

public interface LoginDao {

	void saveLoginDetails(Login login);
	boolean checkLoginDetails(Login login);
	public void checkLogin(String userRole, String userId, String password);

}
