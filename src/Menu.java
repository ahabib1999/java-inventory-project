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
		keyboard.close();
	}
	
	public String getChoice() {
		return userInput; 
	}
	
	public void displayMenu() {
		System.out.println("A) View Inventory");
		System.out.println("B) Add/Remove Items");
		System.out.println("C) Update Prices");
		System.out.println(' ');
	}

}
