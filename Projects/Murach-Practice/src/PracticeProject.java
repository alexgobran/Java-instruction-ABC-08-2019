import java.util.Scanner;

public class PracticeProject {

	public static void main(String[]args) {
		System.out.println("Student Registration Form");
		
		String around = "continue";
		Scanner sc= new Scanner(System.in);
		while (around.equalsIgnoreCase("continue")){
			
			
			
			
					System.out.println("Enter First Name:");
					String firstName= sc.next();
					System.out.println(firstName);
					
					System.out.println("Enter Last Name:");
					String lastName= sc.next();
					System.out.println(lastName);
			
		}
		sc.close();
		
	}
}
