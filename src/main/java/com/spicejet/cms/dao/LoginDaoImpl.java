package com.spicejet.cms.dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.spicejet.cms.model.Login;

@Repository("logindao")
public class LoginDaoImpl extends AbstractDao implements LoginDao {

	public void saveLoginDetails(Login login) {
		persist(login);
	}

	public Login checkLoginDetails(Login login) {
		Criteria criteria = getSession().createCriteria(Login.class);
		//criteria.add(Restrictions.)
		
		//TODO 
		return null;
	}

	public Login checkLogin(String userRole, String userId, String password) {
		Map<String, String> propertyValues= new HashMap<String, String>();
		propertyValues.put("userRoll", userRole);
		propertyValues.put("userName", userId);
		propertyValues.put("password", password);
		Criteria criteria = getSession().createCriteria(Login.class);
		criteria.add(Restrictions.allEq(propertyValues));
		
		return (Login) criteria.uniqueResult();
	}

}
