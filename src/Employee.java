import java.util.*;

public class Employee
{
	String name;             // Employee name
	String employeeNumber;   // Employee number
	String hireDate;         // Employee hire date



public Employee(String name, String employeeNumber, String hireDate) throws InvalidEmployeeNumber
{
	if ((!Character.isDigit(employeeNumber.charAt(0)))  ||
          	(!Character.isDigit(employeeNumber.charAt(1)))   ||
          	(!Character.isDigit(employeeNumber.charAt(2)))   ||
          	(employeeNumber.charAt(3) != '-')                ||
          	(!Character.isLetter(employeeNumber.charAt(4)))  ||
          	(!(employeeNumber.charAt(4)>= 'A' && employeeNumber.charAt(4)<= 'M'))) throw new InvalidEmployeeNumber();
	
	this.name = name;
	this.employeeNumber = employeeNumber;
	this.hireDate = hireDate;
}



public void setName(String name)
{
	this.name = name;
}


public void setEmployeeNumber(String employeeNumber) throws InvalidEmployeeNumber
{
	if ((!Character.isDigit(employeeNumber.charAt(0)))  ||
          	(!Character.isDigit(employeeNumber.charAt(1)))   ||
          	(!Character.isDigit(employeeNumber.charAt(2)))   ||
          	(employeeNumber.charAt(3) != '-')                ||
          	(!Character.isLetter(employeeNumber.charAt(4)))  ||
          	(!(employeeNumber.charAt(4)>= 'A' && employeeNumber.charAt(4)<= 'M'))) throw new InvalidEmployeeNumber();
	
	this.employeeNumber = employeeNumber;
}

public void setHireDate(String hireDate)
{
	this.hireDate = hireDate;
}

public String getName()
{
	return name;
}

public String getEmployeeNumber()
{
	return employeeNumber;
}

public String getHireDate()
{
	return hireDate;
}

public String toString()
{
	String str = "Name: " + name + " Employee Number: " + employeeNumber + " Hire Date: " + hireDate;

	return str;
}
}