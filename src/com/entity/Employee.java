package com.entity;

public class Employee {
	
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeePhone;
	private String EmployeeCity;
	
public Employee(int employeeId, String employeeName, String employeePhone, String employeeCity) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeePhone = employeePhone;
		EmployeeCity = employeeCity;
	}
/*	public Employee(String employeeName, String employeePhone, String employeeCity) {
	super();
	EmployeeName = employeeName;
	EmployeePhone = employeePhone;
	EmployeeCity = employeeCity;
} */

public Employee() {
	super();
	
}

public int getEmployeeId() {
	return EmployeeId;
}

public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}

public String getEmployeeName() {
	return EmployeeName;
}

public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

public String getEmployeePhone() {
	return EmployeePhone;
}

public void setEmployeePhone(String employeePhone) {
	EmployeePhone = employeePhone;
}

public String getEmployeeCity() {
	return EmployeeCity;
}

public void setEmployeeCity(String employeeCity) {
	EmployeeCity = employeeCity;
}

@Override
public String toString() {
	return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeePhone=" + EmployeePhone
			+ ", EmployeeCity=" + EmployeeCity + "]";
}

}



