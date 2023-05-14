package player;

import java.util.Scanner;

public interface FootballPlayerInput {
	
	public int getId();
	  
	public void setId(int id);
	
	public void setName(String name);
	
	public void setSns(String sns);
	
	public void setPhone(String phone);
	
	public void getUserInput(Scanner scan);
	
	public void printInfo();
	
	

}
