import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;


public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		FootballPlayerManager footballPlayerManager = getObject("footballplayermanager.ser");
		if(footballPlayerManager == null) {
			footballPlayerManager = new FootballPlayerManager(scan);
		}
				
		
		selectMenu(scan, footballPlayerManager);
		putObject(footballPlayerManager, "footballplayermanager.ser");

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
				logger.log("add a player");
				break;
			case 2:
				footballPlayerManager.deleteplayers();
				logger.log("delete a player");
				break;
			case 3:
				footballPlayerManager.editplayers();
				logger.log("edit a player");
				break;
			case 4:
				footballPlayerManager.viewplayers();
				logger.log("view a list of player");
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
	
	public static FootballPlayerManager getObject(String fileName) {
		FootballPlayerManager footballPlayerManager = null;
		
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			footballPlayerManager = (FootballPlayerManager)in.readObject();
			
			in.close();
			file.close();
			
			
			
		} catch (FileNotFoundException e) {
			return footballPlayerManager;
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return footballPlayerManager;
	}
	
	public static void putObject(FootballPlayerManager footballPlayerManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(footballPlayerManager);
			
			out.close();
			file.close();
			
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	
}
