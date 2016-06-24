package com.spicejet.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spicejet.cms.dao.LoginDao;
import com.spicejet.cms.model.Login;

@Service("loginservice")
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	public void saveLoginDetails(Login login) {
		loginDao.saveLoginDetails(login);
	}

	public void checkLogin(Login login) {

	}

	public Login checkLogin(String userRole, String userId, String password) {
		return loginDao.checkLogin(userRole, userId, password);
	}

	public Login checkLoginAuthenticate(Login login) {
		return loginDao.checkLoginDetails(login);
	}

}
