package com.yusys.dao;

public interface IUserDao<T> {

	public T findByNameAndPwd(T t);
}
