import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FootballPlayerManager footballPlayerManager = new FootballPlayerManager(scan);
		
		selectMenu(scan, footballPlayerManager);

}
	
	public static void selectMenu(Scanner scan, FootballPlayerManager footballPlayerManager) {
		int num = -1;
		while(num != 5 ) {
			try {
		
			showMenu();
			num = scan.nextInt();
			switch(num) {
			case 1:
				footballPlayerManager.addplayers();
				break;
			case 2:
				footballPlayerManager.deleteplayers();
				break;
			case 3:
				footballPlayerManager.editplayers();
				break;
			case 4:
				footballPlayerManager.viewplayers();
				break;
			default: 
				continue;
			}
		}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (scan.hasNext()) {
					scan.next();
				}
				num = -1;
				
			}
		}
		
}
	
	public static void showMenu() {
		System.out.println("# Football Management System Menu #");
		System.out.println(" 1. Add Players");
		System.out.println(" 2. Delete Players");
		System.out.println(" 3. Edit Players");
		System.out.println(" 4. View Players");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5 : ");
		
	}

	
}
