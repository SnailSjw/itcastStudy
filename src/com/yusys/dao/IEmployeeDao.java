package com.yusys.dao;

import java.util.List;

public interface IEmployeeDao<T> {

	public List<T> getAll();
}
