package org.fujitsu.training.codes;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Mathematics {
	
	//Step1: create the logger
	private static Logger logger = Logger.getLogger(Mathematics.class.getName());
	
	//Step1B: Set the default levels
	public Mathematics() {
		logger.setLevel(Level.INFO);
		
		try {
			//Step2: add desired medium
			FileHandler file  = new FileHandler("./src/logs/math.log",true);
			file.setEncoding("UTF-8");
			file.setLevel(Level.WARNING);
			
			//Step3: set your own message format on medium
			SimpleFormatter simple = new SimpleFormatter();
			file.setFormatter(simple);
			
			logger.addHandler(file);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.info("Welcome to Mathematics");
	}
	
	public Mathematics(int x) {
		logger.info("Welcome to Mathematics" + x);
	}
	public int add(int x, int y) {
		logger.info("add() called...");
		logger.info("result = " + (x + y));
		logger.info("add() exits...");
		return x + y;
	}
	
	@SuppressWarnings("unused")
	public int div(int x, int y) throws ArithmeticException, Exception{
		logger.info("div() called...");
		logger.warning("deprecated Date object used");
		Date now = new Date(121,0,29);
		
		if(y==0) {
			logger.severe("division by zero error");
			throw new ArithmeticException();
		}
		logger.info("div() exits...");
		return x / y;
	}
	
	public static void display() {
		
	}


}
