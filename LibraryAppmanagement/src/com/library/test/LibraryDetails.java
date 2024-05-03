package com.library.test;

public class LibraryDetails {
	public void libraryOutput(String userName)
	{   
	
		System.out.println("USERNAME : " + userName);

	}
	public void libraryOutput(int libraryid,long phonenumber)
	{ 
		System.out.println("-------------------------");
		System.out.println("          -------WELCOME-------");
		System.out.println("LIBRARY ID: "+libraryid +"  PH: "+phonenumber);
	}
	
    public void libraryOutput(int days)
    {
   	   System.out.println("NO of Days: "+days);
    	if(days<=10)
    	{ 
    		System.out.println(" YOU CAN TAKE A BOOK");
    		System.out.println("      ----THANK YOU----");
    		System.out.println("-----------------------");
    	}
    	
    }

}
