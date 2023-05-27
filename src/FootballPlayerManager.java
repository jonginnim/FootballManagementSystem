import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import player.FootballPlayerInput;
import player.PlayerKind;
import player.ForwardPlayer;
import player.GoalkeeperPlayer;
import player.MidfielderPlayer;

public class FootballPlayerManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1652967168011275911L;
	
	ArrayList<FootballPlayerInput> players = new ArrayList<FootballPlayerInput>();
	transient Scanner scan;
	FootballPlayerManager(Scanner scan){
		this.scan = scan;
	}
	
	public void addplayers() {
		int kind = 0;
		FootballPlayerInput playerInput;
		while(kind < 1 || kind > 3) {	
			try {
			System.out.println("go into add players in while");
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (scan.hasNext()) {
					scan.next();
				}
				kind = -1;
			}
		}
	
		
		
		
	}
	
	public void deleteplayers() {
		System.out.print("Player ID: ");
		int playerId = scan.nextInt();
		int index = findIndex(playerId);
		removefromFootballPlayers(index, playerId);
		
		
	}
	
	public int findIndex(int playerId) {
		int index = -1;
		for (int i=0; i<players.size(); i++) {
			if (players.get(i).getId() == playerId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromFootballPlayers(int index, int playerId) {
		if (index>=0) {
			players.remove(index);
			System.out.println("The Player " + playerId + " is deleted");
			return 1;
			}
		
		else {
			System.out.println("The Player has not been registered.");
			return -1;
		}
	}

	
	public void editplayers() {
		System.out.print("Player ID: ");
		int playerId = scan.nextInt();
		for (int i=0; i<players.size();i++) {
			FootballPlayerInput playerInput = players.get(i); 
			if(playerInput.getId() == playerId) {
			System.out.println("The Player to be Edited is " + playerId);
 			int num = -1;
			while(num != 5 ) {
				showEditMenu();
				num = scan.nextInt();
				switch(num) {
				case 1: 
					playerInput.setPlayerID(scan);
					break;
				case 2:
					playerInput.setPlayerName(scan);
					break;
				case 3:
					playerInput.setPlayerSns(scan);
					break;
				case 4:
					playerInput.setPlayerPhone(scan);
					break;
				default:
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
	

	
	public void showEditMenu() {
		System.out.println("# Football Player Edit Menu #");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Sns");
		System.out.println(" 4. View Phone");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5 : ");
		
	}
}
