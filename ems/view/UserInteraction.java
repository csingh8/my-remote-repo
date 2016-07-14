package com.flp.ems.view;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//import com.flp.ems.Employee.Domain;

public class UserInteraction {
	
	Employee uin=new Employee();
	Scanner sc=new Scanner(System.in);
	private Map<Integer, String> employee= new HashMap<>();
	
	private int emp_id=1000;
	
	
	public void AddEmployee(){
		
		emp_id++;
		UserInteraction uin2 =new UserInteraction();
		uin.setName("chandrakant singh");
		uin.setPhone_no("9778058645");
		uin.setAdd("b/408 pune");
		uin.setJ_date("30/5/2016");
		uin.setdateofbirth("16/09/1993");
		
		employee.put(new Integer(1),uin.getName());
		employee.put(new Integer(2),uin.getPhone_no());
		employee.put(new Integer(3),uin.getAdd());
		employee.put(new Integer(4),uin.getJ_date());
		employee.put(new Integer(5),uin.getdateofbirth());
		
		/*System.out.println(" Employee detail  is : ");
		
		System.out.println("Enter the employee Details of the Employee with ID: "+ obj.emp_id);
		
		for( Entry<Integer, String> e: obj.employee.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}*/
		
		
		
	}
	public void ModifyEmployee(){
		//UserInteraction uin2 =new UserInteraction();
		System.out.println(" Employee detail  is : ");
		
		System.out.println("Enter the employee Details of the Employee with ID: "+ emp_id);
		
		for( Entry<Integer, String> e: employee.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
	public void RemoveEmployee(){
		
	}
	public int SearchEmployee(){
		return 0;
	}
	public int GetAllEmployee(){
		return 0;
	}

}
