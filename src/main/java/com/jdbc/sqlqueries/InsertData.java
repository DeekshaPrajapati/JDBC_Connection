package com.jdbc.sqlqueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.jdbc.utility.PropertyReader;

public class InsertData {

	public static void main(String[] args) {
		
		try {
			  Class.forName(PropertyReader.getConectionInfo("Database_Driver"));
	          Connection conection    =DriverManager.getConnection(PropertyReader.getConectionInfo("DB_URL"),PropertyReader.getConectionInfo("DB_USER"),PropertyReader.getConectionInfo("DB_PASS"));
	  System.out.println(conection);// check
	  
	  
	               Statement     s  = conection.createStatement();
	                String insertdata=" insert into employe values()";
	               
		}
		
		catch(    Exception e) {
			
		}
		
	}

}
