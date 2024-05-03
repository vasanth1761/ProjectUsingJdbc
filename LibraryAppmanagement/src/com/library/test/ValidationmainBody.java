package com.library.test;

import java.util.LinkedList;
import java.util.Scanner;

public class ValidationmainBody {

	public static void usernameLoginAdmin()
	{    
		Scanner sc=new Scanner(System.in);
//		String userName1="vasanth";
		LinkedList<String> li=new LinkedList<String>();
		li.add("vasanth");
		li.add("chandru");
		li.add("guru");
		String userName=sc.next();
		while(true)
		{
			if(li.contains(userName))
			{
			break;
			}
			else
			{
				System.out.println("INVALID USER NAME ");
				System.out.println("Enter the user name again:");
				userName=sc.next();
			}
		}
	}
	public static void passwordLoginAdmin()
	{   
		Scanner sc=new Scanner(System.in);
//		String password1="Vasanth1761";
		LinkedList<String> pas=new LinkedList<String>();
		pas.add("Vasanth1761");
		pas.add("vasanth");
		String password=sc.next();
		while(true)
		{
			if(pas.contains(password))
			{
				break;
			}
			else
			{
				System.out.println("INVALID PASSWORD");
				System.out.println("Enter the password again");
				password=sc.next();
			}
		}
		
	}

	  
	public static int addBook()
	{
		Scanner sc=new Scanner(System.in);
	    int add=sc.nextInt();
		while(true)
		{
			
			if(add ==1||add==2)
			{
				return add;
			}
			else
			{
				System.out.printf("Invalid!!!");
				System.out.println("you only able to add and delete:");
				System.out.println("You should enter the alpha numeric value:");
	    		add=sc.nextInt();
			}
		}
	}

	public static int rows()
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		while(true)
		{
			if(row<=50)
			{
				return row;
			}
			else
			{
				System.out.println("Enter the proper row mentioned above:");
				System.out.println("you should enter the numeric value :");
				row=sc.nextInt();
			}
		}
	}

	public static int books()
	{
		Scanner sc=new Scanner(System.in);
		int books=sc.nextInt();
		while(true)
		{
			if(books>0)
			{
				return books;
			}
			else
			{
				System.out.println("you should enter the numeric value:");
				 books=sc.nextInt();
			}
		}
	}
	 public static String usernameValidation()
	 {   
		 String s1="^[a-zA-Z]+$";
		 
			
		 Scanner sc=new Scanner(System.in);
		 String userName=sc.next();
			while(true)
			{
				if(userName.matches(s1))
				{
					return userName;
				}
				else
				{
					System.out.println("you should use uppercase or lowercase:");
					userName=sc.next();
				}
			}
	 }
	 
	 public static String passwordValidation()
	 {
		 
		 String s2="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*\\d).{5,}";
		 Scanner sc=new Scanner(System.in);
		 String password=sc.next();
	    while(true)
		{
			if(password.matches(s2))
			{
				return password;
			}
			else
			{
				System.out.println("you should use one uppercase:");
				System.out.println("you should use one Lowercaase:");
				System.out.println("you should use one Specialcase:");
				System.out.println("you should use one numeric value:");
				System.out.println("The password length should be minimum 5:");
				
				password=sc.next();
			}
		}
	 }
	  

	public static Long phoneNumberValidation()
	{  
		Scanner sc=new Scanner(System.in);
		long phone=sc.nextLong();
		while(true)
		{
			if(phone>0)
			{
			return phone;
			}
		   else
		   {
			   System.out.println("Enter the mobile number again");
			   phone=sc.nextInt();
		   }
		}
	}

	public static void bookPartValidation() 
	{
		Scanner sc=new Scanner(System.in);
		int part=sc.nextInt();
		while(true)
		{
			if(part==1||part==2)
			{
				break;
			}
			else
			{
				System.out.println("PART IS NOT AVAILABLE:");
				part=sc.nextInt();
			}
		}
		
	}
	public static int bookTypeValid()
	{
		Scanner sc=new Scanner(System.in);
		int type = sc.nextInt();
		while(true)
		{
			if(type==1||type==2||type==3)
			{
				return type;
			}
			else
			{
				System.out.println("Enter the mention book above");
				type = sc.nextInt();
				
			}
		}
		
		
	}
	
	}





