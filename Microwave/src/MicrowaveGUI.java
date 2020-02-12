import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MicrowaveGUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MicrowaveGUI window = new MicrowaveGUI();
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
	//sets global vars
	double timeone;
	double subtime=1, pizzatime=0.75, souptime=1.75;
	double totaltime;
	protected void createContents() {
		shell = new Shell();
		shell.setSize(564, 398);
		shell.setText("SWT Application");
			
		Label lblWhatFood = new Label(shell, SWT.NONE);
		lblWhatFood.setBounds(52, 22, 168, 15);
		lblWhatFood.setText("What food would you like?");
		
		Button btnSub = new Button(shell, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//sets the time for one sub
				timeone=subtime;
			}
		});
		btnSub.setText("Sub");
		btnSub.setBounds(67, 81, 75, 25);
		
		Button btnPizza = new Button(shell, SWT.NONE);
		btnPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//sets time for one pizza
				timeone=pizzatime;
			}
		});
		btnPizza.setText("Pizza");
		btnPizza.setBounds(222, 81, 75, 25);
		
		Button btnSoup = new Button(shell, SWT.NONE);
		btnSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets time for one soup
				timeone=souptime;
			}
		});
		btnSoup.setText("Soup");
		btnSoup.setBounds(398, 81, 75, 25);
		
		Label lblHowMany = new Label(shell, SWT.NONE);
		lblHowMany.setText("How many?");
		lblHowMany.setBounds(52, 190, 168, 15);
		
		Label lblTime = new Label(shell, SWT.NONE);
		lblTime.setText("It will take");
		lblTime.setBounds(52, 294, 168, 15);
		
		Button btnOne = new Button(shell, SWT.NONE);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//calculates time
				totaltime= timeone * 1 ;
				//displays time
				lblTime.setText("It will take "+totaltime + " Minutes");
			}
		});
		btnOne.setText("One");
		btnOne.setBounds(52, 234, 75, 25);
		
		Button btnTwo = new Button(shell, SWT.NONE);
		btnTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//calculates time
				totaltime= timeone * 1.5 ;
				//displays time
				lblTime.setText("It will take "+totaltime + " Minutes");
			}
		});
		btnTwo.setText("Two");
		btnTwo.setBounds(222, 234, 75, 25);
		
		Button btnThree = new Button(shell, SWT.NONE);
		btnThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//calculates time
				totaltime= timeone * 2 ;
				
				//displays time
				lblTime.setText("It will take "+totaltime + " Minutes");
			}
		});
		btnThree.setText("Three");
		btnThree.setBounds(398, 234, 75, 25);

	}
}
