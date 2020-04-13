import java.util.Scanner;

public class Menu {

	private String userInput;
	private Scanner keyboard;
	
	public Menu() {
		keyboard = new Scanner(System.in);
		userInput = "";
	}
	
	
	public void setChoice() {
		System.out.print("What would you like to do: ");
		String userChoice = keyboard.nextLine();
		this.userInput = userChoice;
	}
	
	public String getChoice() {
		return userInput; 
	}
	
	public void displayMainMenu() {
		System.out.println("A) View Inventory");
		System.out.println("B) Add/Remove Items");
		System.out.println("C) Update Prices");
		System.out.println(' ');
	}
	
	public void displaySecondaryMenu() {
		System.out.println("A) View All");
		System.out.println("B) View Categories");
	}
	
	public int captureCategoryIndex() {
		System.out.println(" ");
		System.out.print("Which category would you like to view: ");
		String userChoice = keyboard.nextLine();
		this.userInput = userChoice;
		int categoryIndex = Integer.parseInt(userInput);
		return categoryIndex;
	}

}
