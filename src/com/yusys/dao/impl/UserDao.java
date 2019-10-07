package com.yusys.dao.impl;

import org.apache.commons.dbutils.handlers.BeanHandler;

import com.yusys.dao.IUserDao;
import com.yusys.entity.User;
import com.yusys.utils.JdbcUtils;

public class UserDao implements IUserDao<User> {

	@Override
	public User findByNameAndPwd(User t) {
		try {
			String sql = "SELECT ID,USERNAME,PASSWORD FROM USERS WHERE USERNAME = ? AND PASSWORD = ?";

			return JdbcUtils.getQueryRunner().query(sql, new BeanHandler<User>(User.class), t.getUsername(),
					t.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

}
