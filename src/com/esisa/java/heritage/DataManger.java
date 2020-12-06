package com.esisa.java.heritage;

import java.util.Vector;

public class DataManger {

	private Vector<String> data;
	private Logger logger = null;//vector de logger
	
	public DataManger() {
		data = new Vector<String>();
	}
	
	public void setLogger(Logger logger) {//autre
		this.logger = logger;
	}
	
	public void insert(String item) {
		if (logger != null ) logger.log("INSERT", item);
		data.add(item);
	}
	
	public String select(int index) {
		if (logger != null ) logger.log("SELECT", index);
		return data.get(index);
	}
	
	public void delete(int index) {
		if (logger != null ) logger.log("DELETE", index);
		data.remove(index);
	}

	public void print() {
		System.out.println(data);
	}
	
}
