/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 3-Logging CompanyGUI
 * This program taht calculates the max number of logs that a truck can hold on a gui
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LogGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LogGUI window = new LogGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(504, 360);
		shell.setText("SWT Application");
		
		Label lblMaxLogs = new Label(shell, SWT.NONE);
		lblMaxLogs.setBounds(47, 236, 362, 15);
		
		Label lblWhatLogsWould = new Label(shell, SWT.NONE);
		lblWhatLogsWould.setBounds(151, 34, 187, 15);
		lblWhatLogsWould.setText("What logs would you like?");
		
		Button btnSmall = new Button(shell, SWT.NONE);
		btnSmall.addSelectionListener(new SelectionAdapter() {
	
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				final double LOG=0.25;
				final float MAXLOAD=1100;
				double numblogs;
				
				//determines how many logs can be carried
				numblogs= MAXLOAD/LOG;
				
				//displays this number
				lblMaxLogs.setText("The truck can hold "+ String.valueOf(numblogs)+" logs");							
			}
		});
		btnSmall.setBounds(68, 110, 75, 25);
		btnSmall.setText("Small");
		
		Button btnMedium = new Button(shell, SWT.NONE);
		btnMedium.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				final double LOG=0.50;
				final float MAXLOAD=1100;
				double numblogs;
				
				//determines how many logs can be carried
				numblogs= MAXLOAD/LOG;
				
				//displays this number
				lblMaxLogs.setText("The truck can hold "+ String.valueOf(numblogs)+" logs");	
			}
		});
		btnMedium.setText("Medium");
		btnMedium.setBounds(202, 110, 75, 25);
		
		Button btnHuge = new Button(shell, SWT.NONE);
		btnHuge.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				final double LOG=1;
				final float MAXLOAD=1100;
				double numblogs;
				
				//determines how many logs can be carried
				numblogs= MAXLOAD/LOG;
				
				//displays this number
				lblMaxLogs.setText("The truck can hold "+ String.valueOf(numblogs)+" logs");	
			}
		});
		btnHuge.setText("Huge");
		btnHuge.setBounds(355, 110, 75, 25);
		

	}
}
