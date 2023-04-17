import java.util.ArrayList;
import java.util.Scanner;

public class FootballPlayerManager {
	ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
	
	FootballPlayer player;
	Scanner scan;
	
	FootballPlayerManager(Scanner scan){
		this.scan = scan;
	}
	
	public void addplayers() {
		
		FootballPlayer player = new FootballPlayer();
		System.out.print("Player ID: ");
		player.id = scan.nextInt();
		System.out.print("Player name: ");
		player.name = scan.next();
		System.out.print("SNS address: ");
		player.sns = scan.next();
		System.out.print("Phone number: ");
		player.phone = scan.next();
		players.add(player);
	}
	
	public void deleteplayers() {
		System.out.print("Player ID: ");
		int playerId = scan.nextInt();
		int index = -1;
		for (int i=0; i<players.size(); i++) {
			if(players.get(i).id == playerId) {
				index = i;
				break;
			}
		}
		
		if (index>=0) {
			players.remove(index);
			System.out.println("The Player "+playerId+" is deleted");
			
		}
		
		else {
			System.out.println("The Player has not been registered.");
			return;
		}
		
	}

	
	public void editplayers() {
		System.out.print("Player ID: ");
		int playerId = scan.nextInt();
		for (int i=0; i<players.size();i++) {
			FootballPlayer player = players.get(i);
		if(player.id == playerId) {
			System.out.println("The Player to be Edited is "+playerId);
			
			int num = -1;
			while(num != 5 ) {
				System.out.println("# Football Player Edit Menu #");
				System.out.println(" 1. Edit Id");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Sns");
				System.out.println(" 4. View Phone");
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1 - 5 : ");
				
				num = scan.nextInt();
				if (num ==1) {
					System.out.print("Player Id: ");
					player.id = scan.nextInt();
				}
				else if (num==2) {
					System.out.print("Player Name: ");
					player.name = scan.next();
				}
				else if (num==3) {
					System.out.print("Player Sns: ");
					player.sns = scan.next();
				}
				else if (num==4) {
					System.out.print("Phone Number: ");
					player.phone = scan.next();
				}
				else {
					continue;
				}
			
			}
			break;
			}
		}
}
	
	public void viewplayers() {
		for (int i =0; i<players.size();i++) {
			players.get(i).printInfo();
		}
	}
}
