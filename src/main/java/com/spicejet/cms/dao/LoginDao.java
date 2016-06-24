package com.spicejet.cms.dao;

import com.spicejet.cms.model.Login;

public interface LoginDao {

	void saveLoginDetails(Login login);
	Login checkLoginDetails(Login login);
	public Login checkLogin(String userRole, String userId, String password);

}
