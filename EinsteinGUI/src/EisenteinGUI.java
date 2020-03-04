/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 3-Einstein Equation GUI
 * This program calculates the energy from einstein's equation in a GUI 
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class EisenteinGUI {

	protected Shell shell;
	private Text txtEntered;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			EisenteinGUI window = new EisenteinGUI();
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
		shell.setSize(526, 370);
		shell.setText("SWT Application");
		
		txtEntered = new Text(shell, SWT.BORDER);
		txtEntered.setBounds(201, 116, 76, 21);
		
		Label lblEinsteinCalculator = new Label(shell, SWT.NONE);
		lblEinsteinCalculator.setBounds(190, 76, 104, 15);
		lblEinsteinCalculator.setText("Einstein Calculator");
		
		Label lblEnergy = new Label(shell, SWT.NONE);
		lblEnergy.setBounds(107, 229, 356, 15);
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				double mass;
				final double SPEEDOFLIGHT=2.998*Math.pow(10,8);
				double energy;
				
				//gets mass
				mass=Double.parseDouble(txtEntered.getText());
				
				//calculates the energy
				energy= mass*Math.pow(SPEEDOFLIGHT, 2);
				
				//outputs the energy
				lblEnergy.setText("The amount of energy is " + energy + " kJ");
				
				
				
			}
		});
		btnCalculate.setBounds(322, 145, 75, 25);
		btnCalculate.setText("Calculate");

	}
}
