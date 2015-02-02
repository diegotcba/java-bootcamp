package meetings;

import java.util.List;

public interface MeetingsService {
	public List<Room> getRooms();
	public List<Attendee> getAttendees();
	public List<Meeting> getMeetings();
	public void cancelMeeting(int id);
	public void updateMeeting(int id, String name, Room room, List<Attendee> attendees);
	public void newMeeting(int id, String name, Room room, List<Attendee> attendes);
	public Meeting getMeeting(int id);
}
