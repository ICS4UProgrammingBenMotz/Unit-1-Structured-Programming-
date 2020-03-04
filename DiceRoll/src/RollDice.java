/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 9-DiceRoll
 * This program tahtcreates a random number where the maximum value given by the user.
*/

import java.util.Random;
import java.util.Scanner;

public class RollDice {

    public static void RollDice(){

        int maxrand;
        int randomnumb;

        System.out.print("Please enter the max value for the random number\n");

        //gets users input
        Scanner scanner = new Scanner(System.in);

        //checks if input is valid
        try {
            //creates the max random
            maxrand=scanner.nextInt();

            //creates random number
            randomnumb= new Random().nextInt(maxrand)+1;

            //prints random number
            System.out.print("The random number is " + randomnumb);
        }
        //if it is an invalid value
        catch(Exception e){
            //lets user know that there is an error
            System.out.println("Please enter a number");

            //reruns function
            RollDice();
        }
    }

    public static void main(String[] args) {
        RollDice();
    }

}
