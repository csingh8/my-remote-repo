package com.flp.ems.view;
import java.util.Scanner;

public class BootClass {
	public static void main(String[] args) {
	
		BootClass object =new BootClass();
		object.menuSelection();
		
		
		
		
	}
	
	public void menuSelection(){
		UserInteraction uin =new UserInteraction();
		System.out.println("option 1 for AddEmployee");
		System.out.println("option 2 for ModifyEmployee");
		System.out.println("option 3 for RemoveEmployee");
		System.out.println("option 4 for SearchEmployee");
		System.out.println("option 5 for getAllEmployee");
		Scanner sc=new Scanner(System.in);
			int i=	sc.nextInt();
		
		switch(i){
		case 1:
			uin.AddEmployee();
			break;
		case 2:
			uin.ModifyEmployee();
			break;
		case 3:
			uin.RemoveEmployee();
			break;
		case 4:
			uin.SearchEmployee();
			break;
		case 5:
			uin.GetAllEmployee();
		}

		
	}

}
