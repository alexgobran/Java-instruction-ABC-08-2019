import java.util.Scanner;

public class LoopandSwitchApp {

	public static void main(String[] args)
	{
		
		System.out.println("Hello");
		Scanner sc = new Scanner(System.in);
//index for loop
//print the number 1 to n
		System.out.println("Enter # of times to loop: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i +1);
		}




//switch statement
//convert an int day of the week to a String dow

System.out.println("Enter a numeric day of the week: ");
int dow = sc.nextInt();
String dowString = "";
 
switch (dow ) {
case 1:
	dowString = "Sunday";
	break;
	
case 2:
	dowString = "Monday";
	break;
case 3:
	dowString = "Tuesday";
	break;
case 4:
	dowString = "Wednesday";
	break;
case 5:
	dowString = "Thursday";
	break;
case 6:
	dowString = "Friday";
	break;
case 7:
	dowString = "Saturday";
	break;

}


	}
}
