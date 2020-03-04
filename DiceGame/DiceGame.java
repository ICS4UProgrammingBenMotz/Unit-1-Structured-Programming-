/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 8- Dice Game
 * This program taht plays a dice game with the user
*/
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class DiceGame {
    private JLabel lblGuess;
    private JLabel lblNumbOGuess;
    private JLabel lblCorrectNumb;
    private JComboBox cmbNumbers;
    private JPanel panel1;
    private JButton btnEnterGuess;

    int randomnumb;
    int numbOguess=0;
    int guess;

    public DiceGame() {
        //creates a random number
        randomnumb= new Random().nextInt(6)+1;
        btnEnterGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                guess = cmbNumbers.getSelectedIndex() + 1;

                //checks if the guess is correct
                if (guess == randomnumb) {
                    numbOguess++;
                    lblCorrectNumb.setText("Correct Answer! The number was "+randomnumb);
                    lblNumbOGuess.setText("Number of Guesses: "+numbOguess);
                    btnEnterGuess.disable();
                } else {
                    numbOguess++;
                    lblCorrectNumb.setText("Wrong Guess, try again");
                    lblNumbOGuess.setText("Number of Guesses: "+numbOguess);
                }
            }
        });
    }

    public static void main(String[]args){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new DiceGame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
