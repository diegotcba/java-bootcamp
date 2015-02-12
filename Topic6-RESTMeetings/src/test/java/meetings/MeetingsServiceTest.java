package meetings;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MeetingsServiceTest {

	@Test
	public void testCreateService()
	{
		MeetingsService service=MeetingsServiceFactory.getLocalService();
		assertTrue(service!=null);
	}
	
	@Test
	public void testRoomsCount()
	{
		MeetingsService service=MeetingsServiceFactory.getLocalService();
		assertTrue(service.getRooms().size()>0);
	}
	
	@Test
	public void testAttendeesCount()
	{
		MeetingsService service=MeetingsServiceFactory.getLocalService();
		assertTrue(service.getAttendees().size()>0);
	}
	
	@Test
	public void testMeetingsNotNull()
	{
		MeetingsService service=MeetingsServiceFactory.getLocalService();
		assertTrue(service.getMeetings()!=null);
	}
	
	@Test
	public void testNewMeeting()
	{
		MeetingsService service=MeetingsServiceFactory.getLocalService();
		Room room=service.getRooms().get(2);
		List<Attendee> attendes=new ArrayList<Attendee>();
		attendes.add(service.getAttendees().get(2));
		attendes.add(service.getAttendees().get(3));
		service.newMeeting(0, "TestMeeting", room, attendes);
		assertTrue(service.getMeetings().size()>0);
	}
	
}
