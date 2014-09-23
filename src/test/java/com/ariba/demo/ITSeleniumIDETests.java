package com.ariba.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.Logger;

public class ITSeleniumIDETests extends TestCase {

	Logger logger = LoggingFactory.getLogger();

	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public ITSeleniumIDETests(String testName) {
		super(testName);

	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {

		return new TestSuite(ITSeleniumIDETests.class);
	}

	/**
	 * Rigourous Test :-)
	 */

	public void testUsingSeleniumIDE() {
		logger.debug("Starting the test using selenium IDE");

		try {

			// run the Unix "ps -ef" command

		
			ProcessBuilder processBuilder = new ProcessBuilder("/bin/bash", "/ariba/1433/ariba/buyer/test-invoicing/runScripts.sh");
			Process process = processBuilder.start();
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(
					process.getInputStream()));

			BufferedReader stdError = new BufferedReader(new InputStreamReader(
					process.getErrorStream()));

			// read the output from the command

			logger.debug("Here is the standard output of the command:\n");
			String s;
			while ((s = stdInput.readLine()) != null) {
				logger.debug(s);
			}

			// read any errors from the attempted command

			logger.debug("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {
				logger.debug(s);
			}
			try {
				process.waitFor();
			} catch (InterruptedException e) {
				logger.debug("exception happened - here's what I know: ");
				e.printStackTrace();
				System.exit(-1);
			}
			//System.exit(0);
		} catch (IOException e) {
			logger.debug("exception happened - here's what I know: ");
			e.printStackTrace();
			System.exit(-1);
		}
		
		logger.debug("ending the test using selenium IDE");
	}

}
