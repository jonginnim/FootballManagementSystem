import java.util.ArrayList;
import java.util.Scanner;
import player.FootballPlayer;
import player.FootballPlayerInput;
import player.PlayerKind;
import player.ForwardPlayer;
import player.GoalkeeperPlayer;
import player.MidfielderPlayer;

public class FootballPlayerManager {
	ArrayList<FootballPlayerInput> players = new ArrayList<FootballPlayerInput>();
	
	FootballPlayer player;
	Scanner scan;
	
	FootballPlayerManager(Scanner scan){
		this.scan = scan;
	}
	
	public void addplayers() {
		int kind = 0;
		FootballPlayerInput playerInput;
		while(kind != 1 && kind !=2) {	
			System.out.println("1 for Forward.");
			System.out.println("2 for Midfielder");
			System.out.println("3 for Defender");
			System.out.println("4 for Goalkeeper");
			System.out.println("Select number for Player's Position between 1-4: ");
			kind = scan.nextInt();
			if (kind==1) {
				playerInput = new ForwardPlayer(PlayerKind.Forward);
				playerInput.getUserInput(scan);
				players.add(playerInput);
				break;
			}
			else if (kind==2) {
				playerInput = new MidfielderPlayer(PlayerKind.Midfielder);
				playerInput.getUserInput(scan);
				players.add(playerInput);
				break;
			}
		
			else if (kind==4) {
				playerInput = new GoalkeeperPlayer(PlayerKind.Goalkeeper);
				playerInput.getUserInput(scan);
				players.add(playerInput);
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
			FootballPlayerInput playerInput = players.get(i); 
			if(playerInput.getId() == playerId) {
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
					playerInput.setId(id);
				}
				else if (num==2) {
					System.out.print("Player Name: ");
					String name = scan.next();
					playerInput.setName(name);
				}
				else if (num==3) {
					System.out.print("Player Sns: ");
					String sns = scan.next();
					playerInput.setSns(sns);
				}
				else if (num==4) {
					System.out.print("Phone Number: ");
					String phone = scan.next();
					playerInput.setPhone(phone);
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
