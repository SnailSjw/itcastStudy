package com.yusys.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yusys.dao.IEmployeeDao;
import com.yusys.entity.Employee;
import com.yusys.utils.JdbcUtils;

public class EmployeeDao implements IEmployeeDao<Employee> {

	@Override
	public List<Employee> getAll() {
		try {
			String sql="SELECT ID,EMP_NAME,DEPT_ID FROM EMPLOYEE";
			return JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<Employee>(Employee.class));
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
