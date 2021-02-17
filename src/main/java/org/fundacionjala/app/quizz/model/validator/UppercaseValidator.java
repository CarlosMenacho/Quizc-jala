package org.fundacionjala.app.quizz.model.validator;

import java.util.List;

public class UppercaseValidator implements Validator{

    private static final String ERROR_MESSAGE = "The characters must be written in uppercase";

    @Override
    public void validate(String value, String conditionValueString, List<String> errors) {
        try {
        	
        	if(isStringUpperCase(value)==false)
        	{
        		errors.add(ERROR_MESSAGE);
        	}


        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            errors.add(IntegerParser.ERROR_MESSAGE_INVALID_NUMBER);
        }

    }
    private static boolean isStringUpperCase(String str)
    {
    	
    	char[] charArray = str.toCharArray();
    	for(int i=0; i<charArray.length; i++)
    	{
    		if(!Character.isUpperCase(charArray[i]))
    		{
    			return false;
    		}
    	}
    	return true;
    }
	
}
