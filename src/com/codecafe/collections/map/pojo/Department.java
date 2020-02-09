package com.codecafe.collections.map.pojo;

public class Department {
	
	private String departmentName;
	private String departmentCategory;
	
	public Department(String departmentName, String departmentCategory) {
		this.departmentName = departmentName;
		this.departmentCategory = departmentCategory;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentCategory() {
		return departmentCategory;
	}
	
	public void setDepartmentCategory(String departmentCategory) {
		this.departmentCategory = departmentCategory;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentCategory=" + departmentCategory + "]";
	}
	
}