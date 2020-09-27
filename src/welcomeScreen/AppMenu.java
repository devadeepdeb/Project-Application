package welcomeScreen;

import java.io.FileNotFoundException;
import java.util.Scanner;

import operations.BusinessOperations;

public class AppMenu {

	public static void menuDriven() throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BusinessOperations obj=new BusinessOperations();
		String option;
		do {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Enter your choice which you want to select: \n");
			System.out.println("\t1. Retrieve current filenames in ascending order \n");
			System.out.println("\t2. Business-level operation menu \n");
			System.out.println("\t3. Exit from the application \n");
			option=sc.nextLine();
			switch (option) {
			case "1":
				obj.showAllFiles();
				break;
			case "2":
				String ch;
			do {
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("Enter your choice for Business level operation");
				System.out.println("\t1. Add a file and its content to a directory");
				System.out.println("\t2. Delete a file from a directory");
				System.out.println("\t3. Searching a file in a directory");
				System.out.println("\t4. Exit from BOL menu");
				ch=sc.nextLine();
				switch (ch) {
				case "1":
					obj.addFile();
					break;
				case "2":
					obj.deleteFile();
					break;
				case "3":
					obj.searchFile();
					break;
				case "4":
					System.out.println("Exited from the Business Level operation...");
					menuDriven();
					break;
				
				default:
					System.out.println("Invalid Choice");
					break;
				}
			} while (ch!="4");
			case "3":
				System.out.println("Exiting from the application...");
				bye();
				break;
				
			default:
				System.out.println("Invalid Choice");
				
			}
		} while (option!="3");
		sc.close();
	}
	public static void bye() {
		// TODO Auto-generated method stub

		System.out.println("Thanks for Using Our Application... See You Soon");
		System.out.println("-------------------------------------------------------------------------------");
		System.exit(0);
	}
}
