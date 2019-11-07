package Model;

public class Item {
	
	private Product product;
	private int quantity;
	/**
	 * @param product
	 * @param quantity
	 */
	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	/**
	 * 
	 */
	public Item() {
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
