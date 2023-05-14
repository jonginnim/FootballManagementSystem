package player;

import java.util.Scanner;

public class MidfielderPlayer extends FootballPlayer implements FootballPlayerInput {
	
	public MidfielderPlayer(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner scan) {
		System.out.print("Player ID: ");
		int id = scan.nextInt();
		this.setId(id);
		
		System.out.print("Player name: ");
		String name = scan.next();
		this.setName(name);
		
		System.out.print("SNS address: ");
		String sns = scan.next();
		this.setSns(sns);
		
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
