package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Employee;
import com.employeeDao.EmployeeDao;

public class start {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go)
		{
			System.out.println("press 1 to ADD new Employee");
			System.out.println("press 2 to delete Employee");
			System.out.println("press 3 to display Employee");
			System.out.println("press 4 to Update Employee");
			System.out.println("press 5 to search Employee");
			System.out.println("press 6 to count total records ");
			System.out.println("press 7 to display records  in decending order");
			System.out.println("press 8 for like operator");
			System.out.println("press 9 to exit Application");
			
			int c=Integer.parseInt(br.readLine());
			
			switch (c) 
			{
			case 1: //add employee
				System.out.println("enter employee  id :");
				int id = Integer.parseInt(br.readLine());
				
				System.out.println("Enter employee name :");
				String name= br.readLine();
				
				System.out.println("Enter employee phone no :");
				String phone= br.readLine();
				
				System.out.println("Enter employee city :");
				String city= br.readLine();
				
				//create employee object to store the data 
				Employee st = new Employee(id,name, phone,city);
				
				
				boolean ans = EmployeeDao.insertEmployee(st);
				if(ans)
				{
					System.out.println("employee is added successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				break;
			
			case 2: // delete employee
				System.out.println("enter employee id which you want to delete");
				int userId = Integer.parseInt(br.readLine());
				
				boolean f= EmployeeDao.deleteEmployee(userId);
				if(f)
				{
					System.out.println("employee data deleted successfully");
				}
				else
				{
					System.out.println("Something went wrong..!!");
				}
				break;
			
			case 3: // display employee
				EmployeeDao.showAllEmployee();
				break;
				
			case 4: // update employee
				System.out.println("enter Employee id whose data you want to update");
				int userId2 = Integer.parseInt(br.readLine());
				
				System.out.println("enter Employee id :");
				int id2 = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Employee name :");
				String name2= br.readLine();
				
				System.out.println("Enter Employee phone no :");
				String phone2= br.readLine();
				
				System.out.println("EnterEmployee city :");
				String city2= br.readLine();
				
				//create Employee object to store the data 
				Employee st2 = new Employee(id2,name2, phone2,city2);
				
				boolean ans2 =EmployeeDao.updateEmployee(st2,userId2);
				
				if(ans2)
				{
					System.out.println("Employee is updated successfully");
				}
				else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st2);
				break;
			
			case 5://search employee
				System.out.println("enter Employee id which you want to search");
				int id3 = Integer.parseInt(br.readLine());
				
				EmployeeDao.searchEmployees(id3);
				break;
			
			case 6:
				break;
			
			case 7:
				break;
			case 8:
				break;
			case 9: // exit
				go=false;
				break;
				
				
			default:
				System.out.println("wrong choice try again");
			}
			
			
			
			}
		System.out.println("thankyou for using my application!!");
			
			
		}

	}