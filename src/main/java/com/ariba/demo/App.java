package com.ariba.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Hello world!
 *
 */
public class App 
{


       public static String now()
       {
   	          
    	   	Calendar now = Calendar.getInstance();
    	   	   int hour = now.get(Calendar.HOUR_OF_DAY);
    	    	
    	   	   String greeting = " Howdi ";
    	   	 // display greeting
    	   	                 if (hour < 12)
    	   	                	greeting += " Good morning.\n";
    	   	                 else if (hour < 17)
    	   	                	greeting += "Good afternoon.\n";
    	   	                 else if (hour < 19)
    	   	                	greeting += "Good evening.\n";
    	   	                 else greeting += "Good night.\n";
    	            return greeting + (new java.util.Date().toString());  
           // return new java.util.Date().toString(); 
       }
 
}
