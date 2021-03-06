/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 10-RPS
 * This program taht plays rock paper scissors with the user
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[]args){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new RockPaperScissors().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JComboBox cmbUserSel;
    private JLabel lblCompChooses;
    private JButton btnSubmitChoice;
    private JLabel lblDes;
    private JPanel panel1;

    //creates global variables
    String userSel;
    int randomnumb;
    int rock=1;
    int paper=2;
    int scissors=3;

    public RockPaperScissors() {

        btnSubmitChoice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //gets what the user selected
                userSel=(String) cmbUserSel.getSelectedItem();

                //generates random number
                randomnumb= new Random().nextInt(3)+1;

                //compares what the user selected vs the random number
                if (randomnumb==rock){
                    //displays label
                    lblCompChooses.setText("The computer chooses rock");

                    if (userSel=="Rock"){
                       lblDes.setText("Tie");
                    }
                    else if (userSel=="Paper"){
                        lblDes.setText("You Win!");
                    }
                    else{
                        lblDes.setText("You Lose!");
                    }
                }
                else if (randomnumb==paper){
                    lblCompChooses.setText("The computer chooses paper");

                    if (userSel=="Rock"){
                        lblDes.setText("You Lose!");
                    }
                    else if (userSel=="Paper"){
                        lblDes.setText("Tie");
                    }
                    else{
                        lblDes.setText("You Win!");
                    }

                }
                else if (randomnumb==scissors){
                    lblCompChooses.setText("The computer chooses scissors");

                    if (userSel=="Rock"){
                        lblDes.setText("You Win!");
                    }
                    else if (userSel=="Paper"){
                        lblDes.setText("You Lose!");
                    }
                    else{
                        lblDes.setText("Tie");
                    }

                }



            }

        });
    }
}
