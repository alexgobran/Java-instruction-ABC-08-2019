import java.util.Scanner;

public class TableofPowers {

	public static void main(String[] args) {
System.out.println("Welcome to the Squares and Cubes table");
String choice = "y";

Scanner sc = new Scanner(System.in);

while(choice.equalsIgnoreCase("y")) {

System.out.println("Enter an Integar:   ");
int I = sc.nextInt();
System.out.println("Enter an Integar:" + I );

int squared= I*I;
int cubed = I*I*I;

System.out.print("Number      "); System.out.print("Squared      "); System.out.println("Cubed");
System.out.print("======      ");   System.out.print("========   "); System.out.println(" ======");

for (int i =1; i<= 9; i++);
System.out.printf("i= "+1, squared,cubed);
 




}
sc.close();
	}

}
