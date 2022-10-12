package com.jdbc.sqlqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.jdbc.utility.PropertyReader;

public class CreateDatabase {

	public static void main(String[] args) {
		try {    // conetion 
			 
			   Class.forName(PropertyReader.getConectionInfo("Database_Driver"));
			   System.err.println("hi");
			          Connection conection    =DriverManager.getConnection(PropertyReader.getConectionInfo("DB_URL"),PropertyReader.getConectionInfo("DB_USER"),PropertyReader.getConectionInfo("DB_PASS"));
			          
			  System.out.println(conection);// check
			
			  
			               Statement     s  = conection.createStatement();
			               String create_database="create database student2"; //remove databe name from properties then only database will create 
			         
			                     int i     =s.executeUpdate(create_database); 
			                     if(i>0) {
			                    	
			                    	 System.out.println("sucess  create database");
			                     }
			                     else {
			                    
			                    	 System.out.println("database not created error");
			                     }
			 	
		}
		
		catch(Exception e) {
			
		}	
		}
			 
		
	}


