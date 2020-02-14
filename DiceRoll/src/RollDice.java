import java.util.Random;
import java.util.Scanner;

public class RollDice {

    public static void RollDice(){

        int maxrand;
        int randomnumb;

        System.out.print("Please enter the max value for the random number\n");

        //gets users input
        Scanner scanner = new Scanner(System.in);

        try {
            maxrand=scanner.nextInt();
            randomnumb= new Random().nextInt(maxrand)+1;
            System.out.print("The random number is " + randomnumb);
        }
        catch(Exception e){
            System.out.println("Please enter a number");
            RollDice();
        }
    }

    public static void main(String[] args) {
        RollDice();
    }

}
