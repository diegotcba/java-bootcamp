package meetings;

import java.util.List;

public class Meeting {
	
	private int id;
	private Room room;
	private List<Attendee> attendes;
	private String name;
	
	public Meeting(int id, String name, Room room, List<Attendee> attendes) {
		super();
		this.id = id;
		this.name=name;
		this.room = room;
		this.attendes = attendes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Attendee> getAttendes() {
		return attendes;
	}

	public void setAttendes(List<Attendee> attendes) {
		this.attendes = attendes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
