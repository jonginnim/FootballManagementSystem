
public class FootballPlayer {
	protected PlayerKind kind = PlayerKind.Forward;
	protected String name;
	protected int id;
	protected String sns;
	protected String phone;
	
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
	public void setSns(String sns) {
		this.sns = sns;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("name: "+name+", id: "+id+", sns address: "+sns+", phone:"+phone);

	}

}
