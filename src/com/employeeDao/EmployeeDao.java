package com.employeeDao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connectionjdbc.Connectionjdbc;
import com.entity.Employee;


public class EmployeeDao {

	
	public static boolean insertEmployee(Employee st)
	{
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="Insert into Employees(eid,ename, ephone, ecity) values(?,?,?,?)";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, st.getEmployeeId());
		p.setString(2, st.getEmployeeName());
		p.setString(3, st.getEmployeePhone());
		p.setString(4, st.getEmployeeCity());
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean deleteEmployee(int userId) {
		
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="delete from Employees where eid=?";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, userId);
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static void showAllEmployee() {
		//boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="select * from Employees;";
		
       Statement s= con.createStatement();
       
       ResultSet set =s.executeQuery(q);
       
       while(set.next())
       {
    	   int id= set.getInt(1);
    	   String name =set.getString(2);
    	   String phone =set.getString(3);
    	   String city =set.getString(4);
    	   
    	   System.out.println("ID: "+id);
    	   System.out.println("Name: "+name);
    	   System.out.println("Phone no :"+phone);
    	   System.out.println("city: "+city);
    	   
    	   System.out.println("_______________________________________________________________");
    	   
    	   
    	   
    	   
       }
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		
	}

	public static boolean updateEmployee(Employee st, int userId2) {
		boolean f=false;
		try
		{
		//jdbccode 
		Connection con = Connectionjdbc.createC();
		String q="update Employees set eid=?, ename=?,ephone=? ,ecity=? where eid=?";
		PreparedStatement p = con.prepareStatement(q);
		
		p.setInt(1, st.getEmployeeId());
		p.setString(2, st.getEmployeeName());
		p.setString(3, st.getEmployeePhone());
		p.setString(4, st.getEmployeeCity());
		p.setInt(5, userId2);
		
		
		//execute
		
		p.executeUpdate();
		f=true;
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
		
	}

	public static void searchEmployees(int id3) {
		boolean f=false;
		try
		{
		//jdbccode 
		
		Connection con = Connectionjdbc.createC();
		String q="select * from Employees where eid=?";
		
		PreparedStatement p = con.prepareStatement(q);
		p.setInt(1, id3);
       
       ResultSet set =p.executeQuery(q);
       
       
       while(set.next())
       {
    	   int id= set.getInt(1);
    	   String name =set.getString(2);
    	   String phone =set.getString(3);
    	   String city =set.getString(4);
    	   
    	   System.out.println("ID: "+id);
    	   System.out.println("Name: "+name);
    	   System.out.println("Phone no :"+phone);
    	   System.out.println("city: "+city);
    	   
    	   System.out.println("_______________________________________________________________");
    	   
    	   
    	   
    	   
       }
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
