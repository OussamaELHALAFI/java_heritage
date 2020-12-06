package com.esisa.java.heritage;

import java.util.GregorianCalendar;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SwingLogger extends JDialog implements Logger{
	//private DefaultListModel<String> model;
	private DefaultTableModel model;
	private int counter = 0;

	public SwingLogger() {
		model = new DefaultTableModel(new String[] {"N°", "Action", "Donnée", "Heure"}, 0);
		//JList<String> list = new JList<>(model);
		JTable table = new JTable(model);
		setContentPane(new JScrollPane(table));
		setSize(400, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void log(String action, Object data) {
		GregorianCalendar gc = new GregorianCalendar();
		int h = gc.get(GregorianCalendar.HOUR);
		int m = gc.get(GregorianCalendar.MINUTE);
		int s = gc.get(GregorianCalendar.SECOND);
		counter++;
		model.addRow(new Object[] {
				counter, action, data, h + ":" + m + ":" + s 
		});
	}

}
