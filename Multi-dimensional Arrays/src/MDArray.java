/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 13- MDA
 * This program uses multi dimensional arrays to calculate the class average
*/
import java.util.Random;

public class MDArray {

    static double average (int [][] grades){
        //create variables
        double average;
        double gradetot = 0;
        double numbgrade=24;

        //loops to add stuff to the array
        for (int students = 0; students < 4; students++){
            for (int assn=0; assn <6; assn++){
                gradetot=gradetot +grades[students][assn];
            }
        }

        //gets the average
        average = gradetot/numbgrade;

        //returns the average
        return average;
    }

    static int randnumb(){

        //generates random number
        int randgennumb;

        randgennumb= new Random().nextInt(101);

        return randgennumb;
    }

    public static void main(String[] args) {
        //creates 2D array
        int [][] grades= new int[4][6];
        double average;
        int randomnumb;

        //adds grades to the array
        for (int studentsadd = 0; studentsadd<4; studentsadd++){
            for (int gradesadded=0; gradesadded<6; gradesadded++){
               randomnumb=randnumb();
               grades[studentsadd][gradesadded]=randomnumb;
            }
        }
        //calls the average function
        average=average(grades);

        //outputs grades
        System.out.printf("The average is: %.1f%%",average  );
    }

}
