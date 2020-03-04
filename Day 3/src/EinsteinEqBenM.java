/*
 * Created by: Ben Motz
 * Created on: 28-02-2020
 * Created for: ICS4U Programming
 * Daily Assignment – Day 3-Einstein Equation
 * This program calculates the energy from einstein's 
*/
import java.util.Scanner;

public class EinsteinEqBenM {

	public static void main(String[] args) {
		final double SPEED_OF_LIGHT=2.998*Math.pow(10, 8);
		
		//creates variables
		double mass;
		double energy;
		
		//prints out question for the user
		System.out.print("Welcome to Einstein's Calculator\nPlease enter your mass");
		
		//accepts the users entry
		Scanner EntMass=new Scanner(System.in);
		
		mass = EntMass.nextDouble();
		
		//calculates the energy
		energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
		
		//displays the energy
		System.out.print("The energy is: " + energy + " Joules" );
		
		
	}

}
