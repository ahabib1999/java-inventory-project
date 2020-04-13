import java.util.ArrayList;

enum Name {
	FOOD, BEVERAGE, ALCOHOL
};

public class Category {

	private Name categoryName;
	private ArrayList<Item> items;

	public Category(ArrayList<Item> _items, Name _categoryName) {
		this.items = _items;
		this.categoryName = _categoryName;
	}

	public void setItems(ArrayList<Item> _items) {
		this.items = _items;
	}
	
	public void addItem(Item newItem) {
		items.add(newItem);
	}

	public ArrayList<Item> getItems() {
		return this.items;
	}

	public Name getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Name categoryName) {
		this.categoryName = categoryName;
	}
	
	public void displayCategory() {
		System.out.println(this.categoryName);
	}


}
