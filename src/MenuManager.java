import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FootballPlayerManager footballPlayerManager = new FootballPlayerManager(scan);
		
		int num = 0;
		while(num != 5 ) {
			System.out.println("# Football Management System Menu #");
			System.out.println(" 1. Add Players");
			System.out.println(" 2. Delete Players");
			System.out.println(" 3. Edit Players");
			System.out.println(" 4. View Players");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5 : ");
			
			num = scan.nextInt();
			if (num ==1) {
				footballPlayerManager.addplayers();
			}
			else if (num==2) {
				footballPlayerManager.deleteplayers();
			}
			else if (num==3) {
				footballPlayerManager.editplayers();
			}
			else if (num==4) {
				footballPlayerManager.viewplayers();
			}
			else {
				continue;
			}
	}

}

	
}
