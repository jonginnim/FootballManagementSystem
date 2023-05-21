package player;

import java.util.Scanner;

import exceptions.SnsFormatException;

public abstract class YouthFootballPlayer extends FootballPlayer {
	
	public YouthFootballPlayer(PlayerKind kind) {
		super(kind);
		}
	
	public abstract void getUserInput(Scanner scan);
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone+", coach's sns address: "+sns+", coach's phone:"+phone );

	}
	
	public void setPlayerSnswithYN(Scanner scan) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
		System.out.print("Do you have a SNS address? (Y/N)");
		answer = scan.next().charAt(0);
		try {
			if (answer == 'y' || answer == 'Y') {
				System.out.print("SNS address: ");
				String sns = scan.next();
				this.setSns(sns);
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
}
