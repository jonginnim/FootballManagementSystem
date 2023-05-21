package player;

import java.util.Scanner;

import exceptions.SnsFormatException;

public interface FootballPlayerInput {
	
	public int getId();
	  
	public void setId(int id);
	
	public void setName(String name);
	
	public void setSns(String sns) throws SnsFormatException;
	
	public void setPhone(String phone);
	
	public void getUserInput(Scanner scan);
	
	public void printInfo();
	
	public void setPlayerID(Scanner scan);
	
	public void setPlayerName(Scanner scan);
	
	public void setPlayerSns(Scanner scan);
	
	public void setPlayerPhone(Scanner scan);
	
	

}
