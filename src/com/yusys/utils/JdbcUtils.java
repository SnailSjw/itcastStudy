package com.yusys.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 数据库工具类
 * @author snailjw
 * 
 */
public class JdbcUtils {

	//初始化c3p0连接池
	private static DataSource dataSource;
	static {
		dataSource= new ComboPooledDataSource();
	}
	
	//获取QueryRunner
	public static QueryRunner getQueryRunner() {
		return new QueryRunner(dataSource);
	}
}
