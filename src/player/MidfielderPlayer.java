package player;

import java.util.Scanner;

public class MidfielderPlayer extends FootballPlayer  {
	
	public MidfielderPlayer(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner scan) {
		setPlayerID(scan);
		setPlayerName(scan);
		setPlayerSns(scan);
		setPlayerPhone(scan);
	} 

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: "+skind+" name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone+", coach's sns address: "+sns+", coach's phone:"+phone );

	}
	
}
