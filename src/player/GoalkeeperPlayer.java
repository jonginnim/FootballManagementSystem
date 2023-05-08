package player;

import java.util.Scanner;

public class GoalkeeperPlayer extends FootballPlayer {
	
	
	
	protected String coachSns;
	protected String coachPhone;
	
	public GoalkeeperPlayer(PlayerKind kind) {
		super(kind);
		
	}

	public void getUserInput(Scanner scan) {
		System.out.print("Player ID: ");
		int id = scan.nextInt();
		this.setId(id);
		
		System.out.print("Player name: ");
		String name = scan.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
		System.out.print("Do you have a SNS address? (Y/N)");
		answer = scan.next().charAt(0);
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
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			
		System.out.print("Do you have a coach's SNS address? (Y/N)");
		answer = scan.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
			System.out.print("coach's SNS address: ");
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
		
		
		System.out.print("Phone number: ");
		String phone = scan.next(); 
		this.setPhone(phone);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Forward: 
			skind = "[FW]";
			break;
		case Midfielder:
			skind = "[MF]";
			break;
		case Defender:
			skind = "[DF]";
			break;
		case Goalkeeper:
			skind = "[GK]";
			break;
		default: 
		}
		System.out.println("kind: "+skind+" name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone+", coach's sns address: "+sns+", coach's phone:"+phone );

	}
}
