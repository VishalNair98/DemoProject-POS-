/**
 * 
 */
package com.cg.pos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.pos.exception.ConnectionException;

/**
 * @author trainee
 * 
 */
public class Connect {
	private static Connection connection = null;
	
	public static Connection getConnection() throws ConnectionException  {
	   try {
		if(null == connection) {
		    connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
      
		}}
		catch(SQLException e) {
			throw new ConnectionException(ExceptionMessages.Message1);
		}
		return connection;
	}
}
