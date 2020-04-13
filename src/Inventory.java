import java.util.ArrayList;

public class Inventory {
	private static String option = "";
	private static Menu myMenu;
	private static ArrayList<Category> categoriesList;

	public static ArrayList<Category> seedData() {

		Item item1 = new Item("Borden", 2.99, 50);
		Item item2 = new Item("Dairy Milk", 1.99, 20);
		Item item3 = new Item("Budwiser", 9.99, 50);
		Item item4 = new Item("Apple", 0.99, 30);
		Item item5 = new Item("Pepsi", 2.25, 60);
		Item item6 = new Item("Bud Light", 9.99, 25);

		ArrayList<Item> foodItems = new ArrayList<Item>();
		foodItems.add(item2);
		foodItems.add(item4);

		ArrayList<Item> beverageItems = new ArrayList<Item>();
		beverageItems.add(item1);
		beverageItems.add(item5);

		ArrayList<Item> alcoholItems = new ArrayList<Item>();
		alcoholItems.add(item3);
		alcoholItems.add(item6);

		Category foodCategory = new Category(foodItems, Name.FOOD);
		Category beverageCategory = new Category(beverageItems, Name.BEVERAGE);
		Category alcoholCategory = new Category(alcoholItems, Name.ALCOHOL);
		
		ArrayList<Category> categoryTypes = new ArrayList<Category>();
		categoryTypes.add(foodCategory);
		categoryTypes.add(beverageCategory);
		categoryTypes.add(alcoholCategory);
		
		return categoryTypes;
	}
	
	// Prints out names of all categories
	public static void displayCategories() {
		
		for (int i = 0; i < categoriesList.size(); i++) {
			Category currentCategory = categoriesList.get(i);
			System.out.println((i + 1) + ")" + " " + currentCategory.getCategoryName());
		}

	}
	
	public static void displayAllItems() {
		System.out.println(' ');
		System.out.format("%10s%10s%10s\t","Name","Price","Quantity");
		System.out.println("\n");
		System.out.println("=========================================");
		System.out.println("\n");
		
		for (int i = 0;i < categoriesList.size();i++) {
			Category currentCategory = categoriesList.get(i);
			ArrayList<Item> items = currentCategory.getItems();
			for (int j = 0;j < items.size();j ++) {
				Item currentItem = items.get(j); 
				System.out.format("%10s%10.2f%10d\n\n", currentItem.getName(), currentItem.getPrice(), currentItem.getQuantity());
			}
		}
	}
	
	// Print all items in a category selected by the user
	public static void printCategoryItems(int categoryIndex) {
		Category currentCategory = categoriesList.get(categoryIndex);
		ArrayList<Item> items = currentCategory.getItems();
		
		System.out.println(' ');
		System.out.format("%10s%10s%10s\t","Name","Price","Quantity");
		System.out.println("\n");
		System.out.println("=========================================");
		System.out.println("\n");
		
		for (int i = 0; i < items.size();i++) {
			Item currentItem = items.get(i);
			System.out.format("%10s%10.2f%10d\n\n", currentItem.getName(), currentItem.getPrice(), currentItem.getQuantity());
		}
		
	}

	public static void main(String [ ] args) {
		myMenu = new Menu();
		categoriesList = seedData();
		myMenu.displayMainMenu();
		setOption();

		if (option.equals("A")) {

			System.out.println(' ');
			myMenu.displaySecondaryMenu();
			setOption();
			
			if (option.equals("A")) {
				displayAllItems();
			}
			
			else if (option.equals("B")) {
				
				System.out.println(' ');
				displayCategories();
				printCategoryItems(myMenu.captureCategoryIndex());
			}
			
				
		}
	}

	public static void setOption() {
		myMenu.setChoice();
		option = myMenu.getChoice();
	}
}
