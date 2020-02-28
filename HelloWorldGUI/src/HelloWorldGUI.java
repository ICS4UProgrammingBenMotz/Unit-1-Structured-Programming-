/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 2 - HelloWorldGUI
 * This program displays hello world in a gui
*/



import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class HelloWorldGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			HelloWorldGUI window = new HelloWorldGUI();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblHelloWorld = new Label(shell, SWT.NONE);
		lblHelloWorld.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		lblHelloWorld.setBounds(168, 107, 96, 35);
		lblHelloWorld.setText("Hello World");

	}
}
