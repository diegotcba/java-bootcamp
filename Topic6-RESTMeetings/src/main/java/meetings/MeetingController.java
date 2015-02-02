package meetings;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingController {

	private final MeetingsService service=MeetingsServiceFactory.getLocalService();
	
	@RequestMapping(value="/rooms",method=RequestMethod.GET)
	public List<Room> getRooms()
	{
		return service.getRooms();
	}
	
	@RequestMapping(value="/attendees",method=RequestMethod.GET)
	public List<Attendee> getAttendees()
	{
		return service.getAttendees();
	}

	@RequestMapping(value="/meetings",method=RequestMethod.GET)
	public List<Meeting> getMeetings()
	{
		return service.getMeetings();
	}
	
	@RequestMapping(value="/meetings/{id}",method=RequestMethod.DELETE)
	public void cancelMeeting(@PathVariable int id)
	{
		service.cancelMeeting(id);
	}
	
//	@RequestMapping(value="/meetings/{id}",method=RequestMethod.PUT)
//	public void updateMeeting(@PathVariable int id)
//	{
//		service.updateMeeting(id, name, room, attendees)
//	}
}
