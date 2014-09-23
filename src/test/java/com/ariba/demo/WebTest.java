package com.ariba.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Unit test for simple App.
 */
public class WebTest extends TestCase {
	static final Logger logger = Logger.getLogger(WebTest.class);
	public static final String MAXIMIZE_BROWSER_WINDOW = "if (window.screen) {window.moveTo(0, 0);window.resizeTo(window.screen.availWidth,window.screen.availHeight);};";

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public WebTest(String testName) {
		super(testName);

	}

	
	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {

		return new TestSuite(WebTest.class);
	}

	/**
	 * UI tests
	 */
	public void testApp() {
		
		logger.info("Starting the testing webUI test");
		
		// Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        WebDriver driver = new FirefoxDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");


        // Check the title of the page
        logger.debug("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();

        
        logger.info("ending the webui test");

	}
	
	}
