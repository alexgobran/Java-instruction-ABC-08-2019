package Model;
 public class Product implements Comparable<Object>{
	
	private String Code;
	private String Description;
	private double Price;
	public Product(String code, String description, double price) {
		super();
		Code = code;
		Description = description;
		Price = price;
	}
	public Product() {
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [Code=" + Code + ", Description=" + Description + ", Price=" + Price + "]";
			
	}
	@Override
	public int compareTo(Object arg0) {
		Product p = (Product)arg0;
		return this.Code.compareTo(p.getCode());
	}

	
	
	
	
}
