package meetings;

import static org.junit.Assert.*;

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
	
}
