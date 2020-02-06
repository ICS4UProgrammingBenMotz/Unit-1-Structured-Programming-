import java.util.Scanner;

public class EinsteinEqBenM {

	public static void main(String[] args) {
		final double SPEED_OF_LIGHT=2.998*Math.pow(10, 8);
		
		double mass;
		double energy;
		
		System.out.print("Welcome to Einstein's Calculator\nPlease enter your mass");
		
		Scanner EntMass=new Scanner(System.in);
		
		mass = EntMass.nextDouble();
		
		energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
		
		System.out.print("The energy is: " + energy + " Joules" );
		
		
	}

}
