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
    	          
    	            String greeting = ". Now it is time to say ";
    	         
    	            // display greeting
    	                          if (hour < 12)
    	                         greeting += " Good morning.";
    	                          else if (hour < 17)
    	                         greeting += "Good afternoon.";
    	                          else if (hour < 19)
    	                         greeting += "Good evening.";
    	                          else greeting += "Good night.";
    	                  return (new java.util.Date().toString()) + greeting ; 

    
       }
}
