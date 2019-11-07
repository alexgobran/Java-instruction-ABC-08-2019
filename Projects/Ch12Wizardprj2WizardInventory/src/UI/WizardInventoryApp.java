package UI;

import java.util.ArrayList;
import java.util.List;

import Util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
System.out.println("Prime Number Checker");
	

	//display the menu and prompt for command
String command = Console.getString(getDisplayMenu());

List<String> items = new ArrayList<>();
items.add("Wizart Hat");
items.add("Wand");
items.add("Maruaders Map");


	while (!command.equalsIgnoreCase("exit")) {
	//do biz logic!
	}
		if (command.equalsIgnoreCase("show")) {
	//show-list all
			for ( int i =0; i < items.size(); i++) {
				//need to display item starting at 1, not 0
				int itemNbr= i +1;
				System.out.println(itemNbr+ "." +items.get(List));
		}
		}
			else if (command.equalsIgnoreCase("grab")) {
	//Grab-add an item
				
			}
			else if (command.equalsIgnoreCase("edit")) {
	//Edit - edit an item
				int nbr = Console.getInt("Number; ");
				//by index, our items start at 0 not 1, so we need to subtract 1 
				//to determine the correct index 
				int idxNbr = nbr -1;
				String updateName = Console.getString("Updated Name: ");
				items.set(idxNbr, updateName);
				}
			else if (command.equalsIgnoreCase("drop")) {
	//Drop- exit the app
				int nbr = Console.getInt("Number: ");
				int idxNbr = nbr -1;
				String dropItem= items.remove(idxNbr);
				System.out.println(dropItem+ "was removed");
	
					}
			else if (command.equalsIgnoreCase("exit"));
	
	command= Console.getString(getDisplayMenu());
	
	
	System.out.println("Bye!");
		}

	
	
	
	
	
	
	
		
	



private static String getDisplayMenu() {
	
	String menu ="COMMAND MENU\n" +
	"show - Show all items\n"+
	"grab - Grab an item\n"+
	"edit - Edit an item\n"+
	"drop - Drop an item\n"+
	"exit - Exit program\n";
	
	return menu;
	
	

	
}


}
