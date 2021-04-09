package com.valuemomentum.training.testing.JunitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest2 {
	

		@Test		
	    public void createAndSetName() {					
	      				
	        String actual= "Y";
	        String expected = "Y";					
	        
	        assertEquals(expected, actual);					
	        System.out.println("Suite Test 2 is successful " + actual);							
	    }		

}
