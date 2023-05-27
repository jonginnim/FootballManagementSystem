package player;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.SnsFormatException;

public abstract class FootballPlayer implements FootballPlayerInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7104351177669237384L;
	
	protected PlayerKind kind = PlayerKind.Forward;
	protected String name;
	protected int id;
	protected String sns;
	protected String phone;
	
	public FootballPlayer() {
		
	}
	
	public FootballPlayer(PlayerKind kind) {
		this.kind=kind;
		
	}
	public FootballPlayer(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public FootballPlayer(String name, int id, String sns, String phone) {
		this.name = name;
		this.id = id;
		this.sns = sns;
		this.phone = phone;
	}

	public FootballPlayer(PlayerKind kind, String name, int id, String sns, String phone) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.sns = sns; 
		this.phone = phone;
	}
	
	public PlayerKind getKind() {
		return kind;
	}
	public void setKind(PlayerKind kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSns() {
		return sns;
	}
	public void setSns(String sns) throws SnsFormatException {
		if (!sns.contains("@") && !sns.equals("")) { 
			throw new SnsFormatException();
		}
		
		this.sns = sns;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public abstract void printInfo();
	
	public void setPlayerID(Scanner scan) {
		System.out.print("Player Id: ");
		int id = scan.nextInt();
		this.setId(id);
		
		}
	
	public void setPlayerName(Scanner scan) {
		System.out.print("Player Name: ");
		String name = scan.next();
		this.setName(name);
		}  
	
	public void setPlayerSns(Scanner scan) {
		String sns ="";
		while (!sns.contains("@")) {
		
		System.out.print("Player Sns: ");
		sns = scan.next();
		try {
			this.setSns(sns);
		} catch (SnsFormatException e) {
			System.out.println("Incorrect Sns Format. Put the Sns address that contains @");
		}
		}
	}
	
	public void setPlayerPhone(Scanner scan) {
		System.out.print("Player Phone: ");
		String phone = scan.next();
		this.setPhone(phone);
		} 
	
	public String getKindString() {
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
		return skind;
		
	}
	
	

}
