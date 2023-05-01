package com.jdbc.sqlqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.jdbc.utility.PropertyReader;

// main method
// try catch 
// load driver/ conection
//sqr query// 
// fetch /while
// print / getid method
public class CreateTable {
	             
	     public static void main(String[] args) {
			try {    // conetion 
				   Class.forName(PropertyReader.getConectionInfo("Database_Driver"));
				          Connection conection    =DriverManager.getConnection(PropertyReader.getConectionInfo("DB_URL"),PropertyReader.getConectionInfo("DB_USER"),PropertyReader.getConectionInfo("DB_PASS"));
				  System.out.println(conection);// check
				  
				  
				               Statement     s  = conection.createStatement();
				            
				               String create_table="create table hello1"+
				              "(id integer not null,"+
				               	"firstName varchar(20),"+
				              "lastName varchar(30),"+
				               	"age int (30),"+
				              "primary key(id))";
				               		 
				                     int i     =s.executeUpdate(create_table); 
				                     if(i>0) {
				                    	
				                    	 System.out.println("sucess  create table");
				                     }
				                     else {
				                    	
				                    	 System.out.println("table not created error");
				                     }
				 	
			}
			
			catch(Exception e) {
				
			}	
			}
				 
		}
	
	


