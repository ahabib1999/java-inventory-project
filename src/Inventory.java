
public class Inventory {
	private String option = "";
	private static Menu myMenu;
	
	public static void main(String[ ] args) {
		myMenu = new Menu();
		
		myMenu.displayMenu();
		myMenu.setChoice();
		
		Item item1 = new Item("Borden", 2.99, 50);
		Item item2 = new Item("Dairy Milk", 1.99, 20);
		Item item3 = new Item("Budwiser", 9.99, 50); 
	
	}
	
	public void setOption() {
		option = myMenu.getChoice();
	}
}
