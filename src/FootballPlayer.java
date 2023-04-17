
public class FootballPlayer {
	String name;
	int id;
	String sns;
	String phone;
	
	public FootballPlayer() {
		
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
	
	public void printInfo() {
		System.out.println("name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone);

	}

}
