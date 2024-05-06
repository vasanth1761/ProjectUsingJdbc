package com.library.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.library.dao.BookImpl;

import java.util.*;



public class Library {

	 
		// TODO Auto-generated method stub
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1.ADMIN \n2.USER  \n3.EXIT");
			int adminUser=sc.nextInt();
	        while(true) 
	        {
	            if(adminUser==1||adminUser==2||adminUser==3)	
	        {
	        switch(adminUser)
			{
			case 1:
		
				System.out.println("ADMIN NAME:");
				LibraryValidation.usernameLoginAdmin();
	            
				System.out.println("ADMIN PASSWORD:");
				LibraryValidation.passwordLoginAdmin();
				
				System.out.println("        -------WELCOME ADMIN--------");
				System.out.println("1.ADD A BOOK"+"\n"+"2.DELETE A BOOK"+"\n"+"3.UPDATE A BOOK");
				System.out.println("-------------------------------------");
				int addDelete=LibraryValidation.addBook();
				LibraryBussinessLogic.toSelectAddDelte(addDelete);
		        return;
				
			case 2:
				LibraryUser.libraryUserPortal();
	            return;
			case 3:
				 System.out.println("Exited Successfully");
				 System.out.println("1.ADMIN or 2.USER or 3.EXIT");
				 adminUser=sc.nextInt();
			}
			}
	        else
	        {
	        	System.out.println("Select the 1- user or 2-admin");
	        	adminUser=sc.nextInt();
	        }       
				
		    }

		}
	


	}


