package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.library.util.BookTable;

public  class BookImpl implements BookNameDAO {
	

	@Override
	public void read() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		{   
			 Connection con= BookTable.getConnection();
			 String read="select*from bookname";
			 PreparedStatement p=con.prepareStatement(read);
			 ResultSet r=p.executeQuery();
			 ResultSetMetaData rs=r.getMetaData();
			 int columnnumber =rs.getColumnCount();
			 while(r.next())
			 {
				 for(int i=1;i<=columnnumber;i++)
				 {
					 String columnvalue=r.getString(i);
					 System.out.println(rs.getColumnName(i)+":"+columnvalue);
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
		 String query="insert into bookname values(?,?,?,?)";
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
		
		Scanner sc=new Scanner(System.in);
		Connection con=BookTable.getConnection();
		System.out.println("Enter the username");
		String name=sc.next();
		System.out.println("Enter the pasword:");
		String password=sc.next();
		String query ="select user_name from login where user_name=? and password_name=?";
		PreparedStatement p=con.prepareStatement(query);
		p.setString(1,name);
		p.setString(2, password);
		ResultSet re=p.executeQuery();
		if(!re.next())
		{
			System.out.println("you dont have an account");
			
		}
		else
		{
			System.out.println("login successfull");
		}
		
				
	}



}
