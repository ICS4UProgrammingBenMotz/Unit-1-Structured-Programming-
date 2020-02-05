import java.util.Scanner;

public class LoggningComp {
	

	public static void main(String[] args) {
		//constants for log weight and max truck weight
		final float MAX_CARRY_WEIGHT=1100;
		final float LOG_MASSES=20;
		//consts for log masses
		final double SMALL_LOG=0.25;
		final double MED_LOG=0.50;
		final double BIG_LOG=1;
		//sets mass of the truck to 0
		double mass_start=0;
		
		double mass;
		
		double maxload;
		
		double log_type;
		
		System.out.print("Welcome to Ben's Logging Compamy");
		
		//creates object
		Scanner What_Logs = new Scanner(System.in); 
		
		//asks user a question		
		System.out.print("If you would like small logs enter 1, for medium logs enter 2 and for large logs enter 3");
		
		log_type= What_Logs.nextDouble();
		
		if (log_type==1) {
		mass=SMALL_LOG;	
		maxload= 1100/(SMALL_LOG*LOG_MASSES);
		System.out.print("The truck can carry "+maxload +" logs");
		}
		else if (log_type==2){
		mass=MED_LOG;
		maxload= 1100/(MED_LOG*LOG_MASSES);
		System.out.print("The truck can carry "+maxload +" logs");
		}
		else if (log_type==3) {
		mass=BIG_LOG;
		maxload= 1100/(BIG_LOG*LOG_MASSES);
		System.out.print("The truck can carry "+maxload +" logs");
		}
		else {
			System.out.print("Error");	
		}
		
	
		
	}

}
