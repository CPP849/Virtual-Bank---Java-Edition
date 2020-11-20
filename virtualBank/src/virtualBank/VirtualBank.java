package virtualBank;

import java.util.Scanner;

public class VirtualBank {
	
	static boolean init = false;
	static String firstName = "";
	static String lastName = "";
	static int balance = 0;
	static int loanOwe = 0;
	
	public static void main(String[] args) {
		intro();
		

	}
	
	public static void mainMenu() {
		clearScreen();
		System.out.println("				██╗░░░██╗██╗██████╗░████████╗██╗░░░██╗░█████╗░██╗░░░░░  ██████╗░░█████╗░███╗░░██╗██╗░░██╗");
		System.out.println("				██║░░░██║██║██╔══██╗╚══██╔══╝██║░░░██║██╔══██╗██║░░░░░  ██╔══██╗██╔══██╗████╗░██║██║░██╔╝");
		System.out.println("				╚██╗░██╔╝██║██████╔╝░░░██║░░░██║░░░██║███████║██║░░░░░  ██████╦╝███████║██╔██╗██║█████═╝░");
		System.out.println("				░╚████╔╝░██║██╔══██╗░░░██║░░░██║░░░██║██╔══██║██║░░░░░  ██╔══██╗██╔══██║██║╚████║██╔═██╗░");
		System.out.println("				░░╚██╔╝░░██║██║░░██║░░░██║░░░╚██████╔╝██║░░██║███████╗  ██████╦╝██║░░██║██║░╚███║██║░╚██╗");
		System.out.println("				░░░╚═╝░░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝  ╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝");
		System.out.println("\n\n\n\n\n\n								Main Menu\n								");
		System.out.println("								01) Create an Account");
		System.out.println("								02) Show Account");
		System.out.println("								03) Deposit Money");
		System.out.println("								04) Withdraw Money");
		System.out.println("								05) DELETE ACCOUNT");
		System.out.print("\n\n\n								Type the option number:    ");
		@SuppressWarnings("resource")
		Scanner choiceS = new Scanner(System.in);
		int choice = choiceS.nextInt();
		if (choice == 1) {
			createAccount();
		} else if (choice == 2) {
			showAccount();
		} else if (choice == 3) {
			deposit();
		} else if (choice == 4) {
			withdraw();
		} else if (choice == 5) {
			deleteAccount();
		} else {
			mainMenu();
		}
		
	}
	
	public static void createAccount() {
		if (init == true) {
			mainMenu();
		} else {
		@SuppressWarnings("resource")
		Scanner firstNameS = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner lastNameS = new Scanner(System.in);
		clearScreen();
		System.out.print("What is your first name?    ");
		firstName = firstNameS.next();
		System.out.print("What is your last name?    ");
		lastName = lastNameS.next();
		
        boolean init = true;
        mainMenu();
        
		}
        
	}
	
	public static void showAccount() {
		@SuppressWarnings("resource")
		Scanner nullS = new Scanner(System.in);
		clearScreen();
		System.out.println("Full Name:    " + firstName + " " + lastName);
		System.out.println("Balance:    " + balance);
		System.out.println("Loans:    " + loanOwe);
		System.out.print("\n					Press \"y\" to leave    ");
		nullS.next();
		mainMenu();
		
	}
	
	public static void deposit() {
		clearScreen();
		@SuppressWarnings("resource")
		Scanner depositS = new Scanner(System.in);
		System.out.println("How much would you like to deposit?    ");
		int depositAmount = depositS.nextInt();
		balance = balance + depositAmount;
		mainMenu();
	}
	
	public static void withdraw() {
		clearScreen();
		@SuppressWarnings("resource")
		Scanner withdrawS = new Scanner(System.in);
		System.out.println("How much would you like to deposit?    ");
		int withdrawAmount = withdrawS.nextInt();
		balance = balance - withdrawAmount;
		mainMenu();
	}

	public static void deleteAccount() {
		@SuppressWarnings("resource")
		Scanner choiceS = new Scanner(System.in);
		clearScreen();
		System.out.println("Are you sure you want to delete your account? \"y\" or \"n\":    ");
		String choice = choiceS.next();
		if (choice == "y") {
			boolean init = false;
			String firstName = "";
			String lastName = "";
			int balance = 0;
		} else {
			deleteAccount();
		}
	}
	
	public static void intro() {
		@SuppressWarnings("resource")
		Scanner nullS = new Scanner(System.in);
		clearScreen();
		System.out.println("				██╗░░░██╗██╗██████╗░████████╗██╗░░░██╗░█████╗░██╗░░░░░  ██████╗░░█████╗░███╗░░██╗██╗░░██╗");
		System.out.println("				██║░░░██║██║██╔══██╗╚══██╔══╝██║░░░██║██╔══██╗██║░░░░░  ██╔══██╗██╔══██╗████╗░██║██║░██╔╝");
		System.out.println("				╚██╗░██╔╝██║██████╔╝░░░██║░░░██║░░░██║███████║██║░░░░░  ██████╦╝███████║██╔██╗██║█████═╝░");
		System.out.println("				░╚████╔╝░██║██╔══██╗░░░██║░░░██║░░░██║██╔══██║██║░░░░░  ██╔══██╗██╔══██║██║╚████║██╔═██╗░");
		System.out.println("				░░╚██╔╝░░██║██║░░██║░░░██║░░░╚██████╔╝██║░░██║███████╗  ██████╦╝██║░░██║██║░╚███║██║░╚██╗");
		System.out.println("				░░░╚═╝░░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝  ╚═════╝░╚═╝░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝");
		System.out.print("\n\n\n								Enter \"y\" to get enter:    ");
		String non = nullS.next();
		mainMenu();
	}
	
	public static void clearScreen() {   
	    System.out.print("\033[H\033[2J");   
	    System.out.flush();  

	}
}
