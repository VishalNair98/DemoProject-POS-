package com.cg.pos.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cg.pos.exception.ConnectionException;

public class CustomerValidation {
      public void custIdValidation(String custId) throws ConnectionException {
    	  Pattern pattern = Pattern.compile("[1]{1}[0-9]{4}");
    	  Matcher matcher = pattern.matcher(custId);
    	  
    	  if((!matcher.find() || custId.isEmpty())) {
    		  throw new ConnectionException(ExceptionMessages.Message3);
    		  
    	  }
//    	  return custId;
    			  
      }
}
