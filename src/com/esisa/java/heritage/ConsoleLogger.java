package com.esisa.java.heritage;

import java.util.GregorianCalendar;

public class ConsoleLogger implements Logger {
	private int counter = 0;
	public ConsoleLogger() {
		
	}

	
	public void log(String action, Object data) {//implaimentation n'est pas redifinition avec le @ovverride
		GregorianCalendar gc = new GregorianCalendar();
		int h = gc.get(GregorianCalendar.HOUR);
		int m = gc.get(GregorianCalendar.MINUTE);
		int s = gc.get(GregorianCalendar.SECOND);
		counter++;
		System.out.println(
				" - " + counter + "> ACTION : " + action + " sur [" + data + "] à " + h + ":" + m + ":" + s 
				);
	}

}
