package com.spicejet.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spicejet.cms.dao.EmployeeDao;
import com.spicejet.cms.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);

	}

}
