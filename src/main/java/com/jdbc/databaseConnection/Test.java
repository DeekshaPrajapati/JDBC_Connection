package com.jdbc.databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test 
{
	
	static String insertMoreValue = "k";
	
	public static void main(String[] args) {
		
		try
		{
		Connection connection= SingletonDemo.getcon();
		Statement statement=connection.createStatement();
		do
		{
		Scanner scanner=new Scanner(System.in);
	    if (insertMoreValue.equals("k")) {
			System.out.println("Do you want to enter a detail of employe");	
	    }
		System.out.println("Eneter Id");
		int id=scanner.nextInt();
		
		System.out.println("Eneter Name");
		String name=scanner.next();
		
		System.out.println("Eneter Mobile");
		String mobile=scanner.next();
		
		System.out.println("Eneter Email");
		String email=scanner.next();
		
		System.out.println("Eneter Pass");
		String pass=scanner.next();
		
		System.out.println("Eneter otp");
		String otp=scanner.next();
//		int i=statement.executeUpdate("insert into dik3 values('"+id+"','"+name+"','"+email+"','"+mobile+"','"+pass+"','"+otp+"')");
		PreparedStatement stmt = connection.prepareStatement("insert into dik3 values(?,?,?,?,?,?)");
		stmt.setInt(1,id);
		stmt.setString(2,name);
		stmt.setString(3,mobile);
		stmt.setString(4,email);
		stmt.setString(5,pass);
		stmt.setString(6,otp);
		
		int i= stmt.executeUpdate();
		
		if(i>0) {
			System.out.println("values inserteddd");
				System.out.println("Do you want to enter more detail of employee, yes or no");
				String s1=scanner.next();
				insertMoreValue = s1;
			}
		else {
			System.out.println("not insertedd....");
		}
		
		}while(insertMoreValue.equals("y"));// ya loop do while bala loop he//
		
		
		// if no but we want see table, so we need select query for data fatching.//
		ResultSet codespeedy=statement.executeQuery("select * from dik3"); 
	    while(codespeedy.next())
	      {
	          System.out.println(codespeedy.getString("id")+"  "+codespeedy.getString("name")+"  "+codespeedy.getString("email")+" "+codespeedy.getString("mobileNo")+" "+codespeedy.getString("pass")+" "+codespeedy.getString("otp"));  
	          
	      }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
}
}



