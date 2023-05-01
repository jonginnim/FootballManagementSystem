import java.util.ArrayList;
import java.util.Scanner;
import player.FootballPlayer;
import player.ForwardPlayer;

public class FootballPlayerManager {
	ArrayList<FootballPlayer> players = new ArrayList<FootballPlayer>();
	
	FootballPlayer player;
	Scanner scan;
	
	FootballPlayerManager(Scanner scan){
		this.scan = scan;
	}
	
	public void addplayers() {
		int kind = 0;
		FootballPlayer player;
		while(kind != 1 && kind !=2) {	
			System.out.println("1 for Forward.");
			System.out.println("2 for Midfielder");
			System.out.println("Select number for Player's Position between 1 and 2: ");
			kind = scan.nextInt();
			if (kind==1) {
				player = new ForwardPlayer();
				player.getUserInput(scan);
				players.add(player);
				break;
			}
			else if (kind==2) {
				player = new FootballPlayer();
				player.getUserInput(scan);
				players.add(player);
				break;
			}
			else {
				System.out.println("Select number for Player's Position.");
			}
		}
	
		
		
		
	}
	
	public void deleteplayers() {
		System.out.print("Player ID: ");
		int playerId = scan.nextInt();
		int index = -1;
		for (int i=0; i<players.size(); i++) {
			if(players.get(i).getId() == playerId) {
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
			if(player.getId() == playerId) {
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
					int id = scan.nextInt();
					player.setId(id);
				}
				else if (num==2) {
					System.out.print("Player Name: ");
					String name = scan.next();
					player.setName(name);
				}
				else if (num==3) {
					System.out.print("Player Sns: ");
					String sns = scan.next();
					player.setSns(sns);
				}
				else if (num==4) {
					System.out.print("Phone Number: ");
					String phone = scan.next();
					player.setPhone(phone);
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
		System.out.println("# of registered players: " + players.size());
		for (int i =0; i<players.size();i++) {
			players.get(i).printInfo();
		}
	}
}
