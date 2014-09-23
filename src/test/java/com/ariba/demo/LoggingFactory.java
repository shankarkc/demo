package com.ariba.demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggingFactory {
	private static Logger testLogger = null;
	private static Object ob = new Object();
	public static Logger getLogger() {
		synchronized (ob) {
			if (testLogger == null) {
				{
					testLogger = Logger.getLogger("MyTestLogger");
					BasicConfigurator.configure();
				}
			}
		}

		return testLogger;
	}
}
