package com.yusys.service.impl;

import com.yusys.dao.IUserDao;
import com.yusys.dao.impl.UserDao;
import com.yusys.entity.User;
import com.yusys.service.IUserService;

public class UserService implements IUserService<User> {

	private IUserDao<User> userDao=new UserDao();
	@Override
	public User login(User user) {
		
		try {
			return userDao.findByNameAndPwd(user);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
