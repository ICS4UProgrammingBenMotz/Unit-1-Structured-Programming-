/*
 * Created by: Ben Motz
 * Created on: 04-March-2020
 * Created for: ICS4U
 * Day #15 (Student ADT)
 * This program takes info from a number of areas then converts it to student info
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//creates new class
class studentinformation{
    //creates variables
    public String FirstName;
    public String MidInit;
    public String LastName;
    public int studentgrade;
    public String identifed;

    public void Outputinfo(){
        //outputs data
        JOptionPane.showMessageDialog(null,FirstName +" "+ MidInit+ " "+ LastName+" is in grade " + studentgrade +" and " + identifed );
    }
}

public class StudentADT {
    private JButton enterButton;
    private JTextField txtfirstname;
    private JTextField txtMidInit;
    private JTextField txtLastName;
    private JCheckBox chkID;
    private JPanel panel1;
    private JLabel lblGrade;
    private JLabel lblMidInit;
    private JLabel lblFN;
    private JLabel lblLN;
    private JLabel lblID;
    private JComboBox cmbGrade;

    public StudentADT() {
        //adds items to the combobox
        cmbGrade.addItem("7");
        cmbGrade.addItem("8");
        cmbGrade.addItem("9");
        cmbGrade.addItem("10");
        cmbGrade.addItem("11");
        cmbGrade.addItem("12");
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //gets all the information
                studentinformation studentinformation = new studentinformation();
                studentinformation.FirstName = txtfirstname.getText();
                studentinformation.LastName = txtLastName.getText();
                studentinformation.MidInit = txtMidInit.getText();
                studentinformation.studentgrade = Integer.parseInt((String) cmbGrade.getSelectedItem());

                //checks if the chk box is selected
                if (chkID.isSelected()){
                    studentinformation.identifed = "is identified";
                }
                else{
                    studentinformation.identifed = "is not identified";
                }
                //outputs info
                studentinformation.Outputinfo();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new StudentADT().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
