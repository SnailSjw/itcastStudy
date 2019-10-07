package com.yusys.entity;

/**
 * 员工实体类
 * @author snailjw
 *
 */
public class Employee {

	/**
	 * 用户编码
	 */
	private int id;
	
	/**
	 * 员工姓名
	 */
	private String empName;
	
	/**
	 * 员工所在的部门编号
	 */
	private int deptId;
	
	public Employee() {
		super();
	}

	
	public Employee(int id, String empName, int deptId) {
		super();
		this.id = id;
		this.empName = empName;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
}
