package player;

import java.util.Scanner;

import exceptions.SnsFormatException;

public class GoalkeeperPlayer extends YouthFootballPlayer {
	
	
	
	protected String coachSns;
	protected String coachPhone;
	
	public GoalkeeperPlayer(PlayerKind kind) {
		super(kind);
		
	}
	

	public void getUserInput(Scanner scan) {
		setPlayerID(scan);
		setPlayerName(scan);
		setPlayerSnswithYN(scan);
		setCoachSnswithYN( scan);
		setPlayerPhone(scan);
	}
	
	public void setCoachSnswithYN(Scanner scan) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
		System.out.print("Do you have a coach's SNS address? (Y/N)");
		answer = scan.next().charAt(0);
		try {
			if (answer == 'y' || answer == 'Y') {
				setPlayerSns(scan);
				break;
				
			}
			else if (answer == 'n' || answer == 'N') {
				this.setSns("");
				break;
			}
			else {
				
			}
		}
			catch(SnsFormatException e){
				System.out.println("Incorrect Sns Format. Put the Sns address that contains @");
			}
	}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone+", coach's sns address: "+sns+", coach's phone:"+phone );

	}
	
	
}
