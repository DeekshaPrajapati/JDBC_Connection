package com.jdbc.databaseConnection;

import java.sql.Connection;

import com.jdbc.utility.PropertyReader;

public class demo 
{
	public static void main(String[] args) 
	{
		//Connection con =SingletonDemo.getcon();
	    //System.out.println(con);
	    System.out.println(PropertyReader.getConfigProperty("DB_Driver"));
	
	
	}
	

}
