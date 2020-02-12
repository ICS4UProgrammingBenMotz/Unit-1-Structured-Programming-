import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SimpleCalc {

	protected Shell shell;
	private Text txtFirstNumb;
	private Text txtSecNumb;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SimpleCalc window = new SimpleCalc();
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
		shell.setSize(540, 381);
		shell.setText("SWT Application");
		
		Label lblFirstNumber = new Label(shell, SWT.NONE);
		lblFirstNumber.setBounds(64, 57, 81, 15);
		lblFirstNumber.setText("First Number");
		
		txtFirstNumb = new Text(shell, SWT.BORDER);
		txtFirstNumb.setBounds(64, 94, 70, 21);
		
		Label lblSecondNumber = new Label(shell, SWT.NONE);
		lblSecondNumber.setBounds(295, 57, 98, 15);
		lblSecondNumber.setText("Second Number");
		
		txtSecNumb = new Text(shell, SWT.BORDER);
		txtSecNumb.setBounds(307, 94, 70, 21);
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(90, 295, 274, 15);
		lblAnswer.setText("");
		
		
		Button btnAdd = new Button(shell, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {	
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//sets variables
				int firstnumb = Integer.parseInt (txtFirstNumb.getText());
				int secnumb = Integer.parseInt (txtSecNumb.getText());
				
				//creates answer
				int ans = firstnumb + secnumb; 
				
				//sends text back			
				lblAnswer.setText("The answer is: " + String.valueOf(ans));
			}
		});
		btnAdd.setBounds(100, 221, 34, 25);
		btnAdd.setText("+");
		
		Button btnSub = new Button(shell, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				int firstnumb = Integer.parseInt (txtFirstNumb.getText());
				int secnumb = Integer.parseInt (txtSecNumb.getText());
				
				//creates answer
				int ans = firstnumb - secnumb; 
				
				//sends text back			
				lblAnswer.setText("The answer is: " + String.valueOf(ans));
			}
		});
		btnSub.setText("-");
		btnSub.setBounds(189, 221, 34, 25);
		
		Button btnMultiplication = new Button(shell, SWT.NONE);
		btnMultiplication.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				int firstnumb = Integer.parseInt (txtFirstNumb.getText());
				int secnumb = Integer.parseInt (txtSecNumb.getText());
				
				//creates answer
				int ans = firstnumb * secnumb; 
				
				//sends text back			
				lblAnswer.setText("The answer is: " + String.valueOf(ans));
			}
		});
		btnMultiplication.setText("*");
		btnMultiplication.setBounds(287, 221, 34, 25);
		
		Button btnDiv = new Button(shell, SWT.NONE);
		btnDiv.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//sets variables
				int firstnumb = Integer.parseInt (txtFirstNumb.getText());
				int secnumb = Integer.parseInt (txtSecNumb.getText());
				
				//creates answer
				float ans = firstnumb / secnumb; 
				
				//sends text back			
				lblAnswer.setText("The answer is: " + String.valueOf(ans));
			}
		});
		btnDiv.setText("/");
		btnDiv.setBounds(389, 221, 34, 25);
	

	}
}
