package com.esisa.java.heritage;

import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class FileLogger implements Logger {
	private PrintWriter out;
	private int counter = 0;
	
	public FileLogger(String source) {
		try {
			out = new PrintWriter(source);
		}
		catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

	public void log(String action, Object data) {
		GregorianCalendar gc = new GregorianCalendar();
		int h = gc.get(GregorianCalendar.HOUR);
		int m = gc.get(GregorianCalendar.MINUTE);
		int s = gc.get(GregorianCalendar.SECOND);
		counter++;
		out.println(
				" - " + counter + "> ACTION : " + action + " sur [" + data + "] à " + h + ":" + m + ":" + s 
				);
	}
	
	public void close() {
		out.close();
	}

}
