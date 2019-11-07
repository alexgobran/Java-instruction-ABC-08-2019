import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator");
		
		//Initialize variables
		
		 String choice = "y";
		 Scanner sc = new Scanner (System.in);
		 
		 
				 while (choice.equalsIgnoreCase("y")) {
			
					 System.out.println("Enter miles:  ");
					 double miles = sc.nextInt();
					 
					 System.out.println("Enter mph:   ");
					 double mph = sc.nextInt();
					 
					 
					 //calculate estimated drive time(Hours and minutes)
					 int hours = (int)(miles/mph);
					 int minutes= (int)((miles% mph));
					 
				 
					 System.out.println("Continue??");
					 
					 System.out.println("Estimated Travel Time");
					 System.out.println("=====================");
					 System.out.println("Hours :+hours");
					 double hours = sc.nextInt()
				 }
				 
				 sc.close();
				 System.out.println("Bye!");
		
	}

}
