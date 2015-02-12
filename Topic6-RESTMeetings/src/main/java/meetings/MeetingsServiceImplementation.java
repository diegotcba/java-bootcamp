package meetings;

import java.util.ArrayList;
import java.util.List;

public class MeetingsServiceImplementation implements MeetingsService {
	private List<Room> rooms;
	private List<Attendee> attendes;
	private List<Meeting> meetings; 
	
	protected MeetingsServiceImplementation() 
	{
		rooms=new ArrayList<Room>();
		rooms.add(new Room(1, "Gustavo Cerati", 6));
		rooms.add(new Room(2, "Spinetta", 4));
		rooms.add(new Room(3, "Charly Garcia", 8));
		
		attendes=new ArrayList<Attendee>();
		attendes.add(new Attendee(1, "Diego", "Tello"));
		attendes.add(new Attendee(2, "Julio", "Villar"));
		attendes.add(new Attendee(3, "Pedro", "Fernandez"));
		attendes.add(new Attendee(4, "Martin", "Castro"));
		
		meetings=new ArrayList<Meeting>();
	}

	@Override
	public List<Room> getRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	@Override
	public List<Attendee> getAttendees() {
		// TODO Auto-generated method stub
		return attendes;
	}

	@Override
	public List<Meeting> getMeetings() {
		// TODO Auto-generated method stub
		return meetings;
	}

	@Override
	public void cancelMeeting(int id) {
		// TODO Auto-generated method stub
		int index=meetings.indexOf(getMeeting(id));
		meetings.remove(index);
	}

	@Override
	public void updateMeeting(int id, String name, Room room, List<Attendee> attendees) {
		// TODO Auto-generated method stub
		Meeting aux=getMeeting(id);
		aux.setName(name);
		aux.setRoom(room);
		aux.setAttendes(attendees);
		
		cancelMeeting(id);
		meetings.add(aux);
	}

	@Override
	public void newMeeting(int id, String name, Room room, List<Attendee> attendes) {
		// TODO Auto-generated method stub
		meetings.add(new Meeting(MeetingID.getInstance().getId(), name, room, attendes));
		MeetingID.getInstance().updateId();
	}

	@Override
	public Meeting getMeeting(int id) {
		// TODO Auto-generated method stub
		Meeting aux=null;
		for (Meeting meeting : meetings) {
			if(meeting.getId()==id)
			{
				aux=meeting;
			}
		}
		return aux;
	}

}
