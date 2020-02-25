import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.io.CharArrayReader;
import java.util.ArrayList;

public class MaxMin {
    private JButton generateNumbersButton;
    private JLabel lblMaxNumb;
    private JLabel lblMinNumb;
    private JPanel panel1;
    private JTextPane textPane1;

    public static int randomnumb;
    public static int[] numbs= new int[10];


    public void MaxNumb(){
        Integer maxnumb=0;
        for(int counter=0; counter<10; counter++){
            if (numbs[counter]> maxnumb){
                maxnumb=numbs[counter];
            }
        }
        lblMaxNumb.setText("The max number is: "+ maxnumb.toString());
    }
    public void MinNumb(){
        Integer minnumb=100;
        for(int counter=0; counter<10; counter++){
            if (numbs[counter]< minnumb){
                minnumb=numbs[counter];
            }
        }
        lblMinNumb.setText("The min number is: "+ minnumb.toString());
    }

    public MaxMin() {
        generateNumbersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


                for(int counter=0; counter<10; counter++){
                    randomnumb= new Random().nextInt(98)+1;
                    numbs[counter]=randomnumb;
                    textPane1.setText(textPane1.getText()+"\n"+randomnumb);

                }
                MaxNumb();
                MinNumb();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new MaxMin().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
