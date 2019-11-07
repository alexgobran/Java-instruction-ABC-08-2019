package UI;

import java.util.ArrayList;
import java.util.List;

import DB.actorDb;
import model.Actor;

public class BootcampMovieDatabaseApp {

	public static void main(String[] args) {
System.out.println("Welcome to the DMDB App");


List<Actor>actors = new ArrayList<>();
actorDb actorDB = new actorDb();

actors = actorDB.GetAll();
System.out.println("List All Actors:");
System.out.println("================");
for (Actor a: actors) {
	System.out.println(a);
}



System.out.println("Bye!");
	}
	

}
