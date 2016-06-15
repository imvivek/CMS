package com.spicejet.cms.dao;

import org.springframework.stereotype.Repository;

import com.spicejet.cms.model.Login;

@Repository("logindao")
public class LoginDaoImpl extends AbstractDao implements LoginDao {

	public void saveLoginDetails(Login login) {
		persist(login);
	}

	public boolean checkLoginDetails(Login login) {
		return false;
	}

	public void checkLogin(String userRole, String userId, String password) {

	}

}
