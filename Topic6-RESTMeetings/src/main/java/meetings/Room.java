package meetings;

public class Room {

	private int id;
	private String name;
	private int attendeesCapacity;
	
	public Room(int id, String name, int attendeesCapacity)
	{
		this.id=id;
		this.name=name;
		this.attendeesCapacity=attendeesCapacity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendeesCapacity() {
		return attendeesCapacity;
	}
	public void setAttendeesCapacity(int attendeesCapacity) {
		this.attendeesCapacity = attendeesCapacity;
	}
	
	
}
