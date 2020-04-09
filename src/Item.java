
public class Item {
	
	private String name;
	private double price;
	private int quantity;
	
	public Item(String _name, double _price, int _quantity) {
		this.name = _name;
		this.price = _price;
		this.quantity = _quantity;
	}
	
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	public void setPrice(double _price) {
		this.price = _price;
	}
	
	public void setQuantity(int _quantity) {
		this.quantity = _quantity;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	

}
