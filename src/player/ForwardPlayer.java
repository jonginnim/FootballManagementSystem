package player;

import java.util.Scanner;

public class ForwardPlayer extends FootballPlayer {
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
		
		
		System.out.print("Phone number: ");
		String phone = scan.next(); 
		this.setPhone(phone);
	}
	
}
