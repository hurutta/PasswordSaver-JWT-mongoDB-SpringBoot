package com;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestApplication 
{
	public static void main(String[] args) 
	{
		Result result = JUnitCore.runClasses(TestUserService.class);
      
		for(Failure failure : result.getFailures()) 
		{
		   	System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());	
	}

}
