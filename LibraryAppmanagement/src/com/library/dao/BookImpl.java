package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.library.test.LibraryValidation;
import com.library.util.BookTable;

public  class BookImpl implements BookNameDAO {
	

	@Override
	public void read() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		{   
			 Connection con= BookTable.getConnection();
			 String read="SELECT*FROM bookname";
			 PreparedStatement p=con.prepareStatement(read);
			 ResultSet r=p.executeQuery();
			 ResultSetMetaData rs=r.getMetaData();
			 int columnnumber =rs.getColumnCount();
//			 for(int i=1;i<=columnnumber;i++)
//			 {
//				 System.out.print(rs.getColumnName(i)+"\t");
//				 
			 
//			 System.out.println();
			 while(r.next())
			 {
				 for(int i=1;i<=columnnumber;i++)
				 {
					 String columnvalue=r.getString(i);
					 System.out.println(rs.getColumnName(i)+" : "+columnvalue+" ");
				 }
				 System.out.println("");
			 }
	}
	}
	

	@Override
	public void insert() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 read();
		 Connection connection =BookTable. getConnection();
		 System.out.println("Enter the book name: ");
		 String name=sc.nextLine();
		 System.out.println("Enter the book no:");
		 int no=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the book type:");
		 String type=sc.nextLine();
		 System.out.println("Enter the part book: ");
		 int book=sc.nextInt();
		 sc.nextLine();
		 String query="INSERT into bookname VALUES(?,?,?,?)";
		 PreparedStatement p= connection.prepareStatement(query);
		 p.setInt(1,no);
		 p.setString(2, name);
        p.setString(3, type);
        p.setInt(4, book);
        int rows=p.executeUpdate();
        read();
        System.out.println("The book has successfully added");
		
	}
	public void login()throws ClassNotFoundException,SQLException {
		
//		LibraryValidation li=new LibraryValidation();
		Scanner sc=new Scanner(System.in);
		Connection con=BookTable.getConnection();
		System.out.println("Enter the userid");
		String id=LibraryValidation.UserId();
		System.out.println("Enter the username");
//		String name=sc.next();
	    String name=LibraryValidation.usernameValidation();
		System.out.println("Enter the password:");
		String password=sc.next();
//		String password=LibraryValidation.passwordValidation();
		String query ="SELECT user_id FROM loginregister WHERE user_id=?AND user_name=?AND user_password=? ";
		PreparedStatement p=con.prepareStatement(query);
		p.setString(1, id);
     	p.setString(2,name);
		p.setString(3, password);
		ResultSet re=p.executeQuery();
		if(!re.next())
		{
			System.out.println("you dont have an account");
			System.out.println("Please Register");
			register();
			
		}
		else
		{
			System.out.println("login successfull");
		}
		
		
				
	}
	public void register()throws ClassNotFoundException,SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=BookTable.getConnection();
		System.out.println("Enter the userid");
		String id=LibraryValidation.UserId(); 
	    System.out.println("Enter the username");
		String na=LibraryValidation.usernameValidation();
	    System.out.println("Enter the password");
	    String password=LibraryValidation.passwordValidation();
		String query="SELECT user_id FROM loginregister WHERE user_id=?";
		PreparedStatement prepare=con.prepareStatement(query);
		prepare.setString(1, id);
		ResultSet result=prepare.executeQuery();
		if(!result.next())
		{
			String check="INSERT INTO loginregister VALUES(?,?,?)";
			
			PreparedStatement p=con.prepareStatement(check);
			p.setString(1, id);
			p.setString(2, na);
			p.setString(3, password);
			p.execute();
			System.out.println("registered  successfull");
		}
		else
		{
			System.err.println("you already have an account");
			System.err.println("please login ");
			login();
			System.out.println("Registered Successfully ");
			
		}
	}

	public void update()throws ClassNotFoundException,SQLException
	{   
		Scanner sc=new Scanner(System.in);
		read();
		Connection con=BookTable.getConnection();
		String book="UPDATE bookname SET book_name=? WHERE book_no=?";
		PreparedStatement p=con.prepareStatement(book);
		System.out.println("Enter the book id:");
		int bookid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the book name:");
		String bookname=sc.nextLine();
		p.setString(1, bookname);
		p.setInt(2, bookid);
		p.execute();
		read();
		System.out.println("updated successfully");
	}
	public  void delete()throws ClassNotFoundException,SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------TABLE-------------------");
		read();
		Connection con=BookTable.getConnection();
		String book="DELETE FROM bookname WHERE book_no=?";
		PreparedStatement p=con.prepareStatement(book);
		System.out.println("Enter the book id:");
		int bookid=sc.nextInt();
		p.setInt(1, bookid);
	    p.execute();
		System.out.println("------------------------UPDATED TABLE-----------------------");
		read();
		System.out.println("Deleted  successfully");
	}
	
	

}
