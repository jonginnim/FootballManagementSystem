import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		while(num !=6 ) {
			System.out.println("# Football Management System Menu #");
			System.out.println(" 1. Add Players");
			System.out.println(" 2. Delete Players");
			System.out.println(" 3. Edit Players");
			System.out.println(" 4. View Players");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6 : ");
			num = scan.nextInt();
			if (num ==1) {
				addplayers();
			}
			else if (num==2) {
				deleteplayers();
			}
			else if (num==3) {
				editplayers();
			}
			else if (num==4) {
				viewplayers();
			}
			else {
				continue;
			}
	}

}
	public static void addplayers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerid = scan.nextInt();
		System.out.print("Player name: ");
		String playername = scan.next();
		System.out.print("SNS address: ");
		String playerSns = scan.next();
		System.out.print("Phone number: ");
		String playerPhone = scan.next();
	}
	
	public static void deleteplayers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerid = scan.nextInt();
	}
	
	public static void editplayers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerid = scan.nextInt();
	}
	
	public static void viewplayers() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player ID: ");
		int playerid = scan.nextInt();
	}
	
}
