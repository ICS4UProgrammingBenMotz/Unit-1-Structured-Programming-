/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 11- Board Foor
 * this program calculates the thrid dimension based off of the other 2 that were given
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardFoot {
    private JPanel BoardFoot;
    private JTextField txtFirstDi;
    private JTextField txtSecDi;
    public JLabel lblsecdi;
    public JLabel lblfirstdi;
    private JButton btnCal;
    public JLabel lblthirddi;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new BoardFoot().BoardFoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void Calcthirddim(int firstdim, int secdim){
        //sets ints
        int totalvol=144;

        int multidim=firstdim*secdim;

        int thirddim=totalvol/multidim;

        //sets the text
        lblthirddi.setText("The third dimension is: " + thirddim + " inches^3");
    }

    public BoardFoot() {
        btnCal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                   //error checking
                try {
                    int firstdim = Integer.parseInt(txtFirstDi.getText());

                    int secdim = Integer.parseInt(txtSecDi.getText());

                    //calls the function
                    Calcthirddim(firstdim, secdim);
                }
                catch(Exception e){
                    //if there is an error
                    lblthirddi.setText("Please enter valid values");
                }
            }
        });
    }
}
