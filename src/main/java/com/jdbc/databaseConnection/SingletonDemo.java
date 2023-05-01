package com.jdbc.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import com.jdbc.utility.PropertyReader;

public final class SingletonDemo 
{
	static Connection connection=null;
	
	private  SingletonDemo()
	{
		
	}
      synchronized static Connection getcon()
      {
    	try {
    		
    	
    		if(connection==null)
    		{
    		  Class.forName(PropertyReader.getConfigProperty("DB_Driver"));
    		  connection =DriverManager.getConnection(PropertyReader.getConfigProperty("DB_URL"),PropertyReader.getConfigProperty("DB_USER"),PropertyReader.getConfigProperty("DB_PASS"));
    		  return connection;
    		}
    		
    		else
    		{	
    		return connection;
    		}
    		}
    		catch (Exception e) {
    			 e.printStackTrace();
    		}
    		return connection;
    		
    		 }
	
	
	}

    		
    	
