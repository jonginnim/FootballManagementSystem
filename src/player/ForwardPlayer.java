package player;

import java.util.Scanner;

public class ForwardPlayer extends YouthFootballPlayer {
	
	
	public ForwardPlayer(PlayerKind kind) {
		super(kind);
		}
	
	public void getUserInput(Scanner scan) {
		setPlayerID(scan);
		setPlayerName(scan);
		setPlayerSnswithYN(scan);
		setPlayerPhone(scan);
	}
}
