package com.spicejet.cms.service;

import com.spicejet.cms.dao.LoginDao;
import com.spicejet.cms.model.Login;

public interface LoginService {

	void saveLoginDetails(Login loginDetails);

	void checkLogin(Login loginDetails);

	Login checkLogin(String userRole, String userId, String password);

	Login checkLoginAuthenticate(Login login);

}
