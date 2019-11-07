package UI;

import Model.Item;
import Model.Product;

public class ProductManagerApp {

	public static void main(String[] args) {
		
		// TODO create an instance of Product
	Product net = new Product(".NET", "Murach's. Net Programming",59.50);
	
		//TODO create an instance of LIneItem
	Item li= new Item(net, 8);
	
		
		//TODO print contents to the console.
System.out.println(net);
System.out.println(li);

//create an array of Products
Product java = new Product("Java","Murach's Java Programming", 53.50);
		Product html = new Product("Java","Murach's Html and CSS", 29.75);
				Product mysql = new Product("Java","Murach's MySQL", 19.20);
						
						Product[]products = {net,java,html, mysql};
				
				System.out.println("List of products" + products);
	}

}
