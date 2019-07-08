package com.cg.pos.exception;

import java.net.ConnectException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import com.cg.pos.util.ExceptionMessages;

@SuppressWarnings("serial")
public class ConnectionException extends Exception {
	public ConnectionException(String Message1) {
		super(Message1);
	
	}

	public ConnectionException(SQLException exception) {
	 
		super(exception);
//		System.out.println(ExceptionMessages.Message1);
	}

	public ConnectionException(ConnectException conException) {
		super(conException);
	}
	
	public ConnectionException(InputMismatchException mismatchException) {
//		super(mismatchException);
		System.out.println(ExceptionMessages.Message1);
	}
}
