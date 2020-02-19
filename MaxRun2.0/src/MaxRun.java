/*
 * Created by: Ben Motz
 * Created on: 16-February-2020
 * Created for: ICS4U Programming
 * Assignment #1 - String Stuff
 * This program determines the max run in a string
 */

import javafx.application.Application;
import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;



public class MaxRun {

    private static String inputLine;
    private static String outputinfo;

    public static void Output(String maxRuninfo)  {

        //creates new text
        String outputfile="Output.txt";

       try{
           //creates printer
           PrintWriter output = new PrintWriter(outputfile);

           //outputs line
           output.println(maxRuninfo);

           //closes file
           output.close();
       }
       catch(Exception e){
           //ensures that there are no errors
           System.out.println("Error in " +  outputfile);
       }

    }

    public static void Reader(){

        //creates the string that will be outputted
        String NameOFile="Input.txt";

        String line = null;

        //ensures that there are no errors when creating the file
        try {
            // reads text
            FileReader fileReader = new FileReader(NameOFile);

            // Wraps in buffered reader
            BufferedReader buffedread = new BufferedReader(fileReader);

            while ((line = buffedread.readLine()) != null) {
                inputLine=line;
            }

            //closes file
            buffedread.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file '" + NameOFile + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '" + NameOFile + "'");
        }
    }

    public static void RestartFunc(){
        String yesorno;

        //prints out the question
        System.out.print("\nWould you like to restart(Please enter yes or no)\n");

        //creates new scanner
      Scanner scanner2= new Scanner(System.in);

      //sets the variable to what was inputted
        yesorno=scanner2.nextLine();

        //checks what the user inputted
        if (yesorno.equals("yes")){
            //restarts the program
            main(new String[0]);
        }
        else if(yesorno.equals("no")){
            //stops the program
            System.out.print("Thanks for using the program");
            System.exit(0);

        }
        else{
            //reruns this function as there was an invalid entry
            RestartFunc();
        }

    }

    public static void maxRunFunc(String input){
        String userInput = input;
        char c1 ;
        char c2;
        int maxrun=1;
        int maxmaxrun=1;
        int charindex=0;
        char maxrunchar;
        String fileouput;

        //adds the string to an array
           char[] maxRunLst=userInput.toCharArray();

        //sets the first character to the first character in the array
        c1 = maxRunLst[charindex];
        maxrunchar=c1;

        //loops through the array to determine the max run
           for (int counter=0; (counter < maxRunLst.length) && ((charindex+1)<maxRunLst.length); counter++){
               //sets c1 and c2
               c1 = maxRunLst[charindex];
               c2 = maxRunLst[charindex+1];

                //checks if c1 and c2 are equal
               if (c1==c2)
               {
                   //increments variables
                   maxrun++;
                   charindex++;

                   //checks if the maxrun needs to be changed
                   if (maxrun > maxmaxrun) {

                       //sets the variables to what occurs in the max run
                       maxmaxrun = maxrun;
                       maxrunchar = c1;
                   }
               }
               else {
                   //if the characters aren't equal then it resets the counting run and increments the index
                   maxrun = 1;
                   charindex++;
               }

           }

           //will display the max run and the character, if the max run is 1, then it will say that the character in the max run could have been all characters in the inputted string
           if (maxmaxrun>1) {
               outputinfo="The max run is " + maxmaxrun + " with " + maxrunchar;
           }
           else{
              outputinfo= "The max run is " + maxmaxrun+ "." + "\nThe characters involved with the max run could have be: " + userInput;

           }


    }

    public static void main(String[] args) {
        String userInput;

        //Asks the user if they want to use information from the file or not
        System.out.print("Would you like to use information from the file (yes or no)\n");

        //creates a scanner
        Scanner scanner = new Scanner(System.in);
        //gets users entry
        String fileyon=scanner.nextLine();
        //checks what the user inputted
        if (fileyon.equals("yes")){
            //calls reader func
            Reader();
            //sets the entered line to what was in the file
            userInput=inputLine;
            //finds the max run of it
            maxRunFunc(userInput);
            Output(outputinfo);
            //checks if the user wants to restart the function
            RestartFunc();
        }
        else if(fileyon.equals("no")){
            //Asks the user to input a string
            System.out.print("Please enter your desired string\n");

            //sets the input to a variable
            userInput = scanner.nextLine();

            //checks if the input is valid and not blank
            if (userInput.isBlank()==true){

                //lets the user know that the string entered is invalid
                System.out.print("\nPlease enter a valid string.\n");

                //restarts the program
                main(new String[0]);
            }
            else {
                //calls the max run function
                maxRunFunc(userInput);
                System.out.print(outputinfo);
                //checks if the user wants to restart the function
                RestartFunc();
            }

        }
        else{
            //reruns this function as there was an invalid entry
            main(new String[0]);
        }

    }

}
