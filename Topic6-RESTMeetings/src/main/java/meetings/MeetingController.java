package meetings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	
	@RequestMapping(value="/meetings/{id}",method=RequestMethod.PUT)
	public void updateMeeting(@PathVariable int id,@RequestBody Meeting input)
	{
		service.updateMeeting(id, input.getName(), input.getRoom(), input.getAttendes());
	}
	
	@RequestMapping(value="/meetings", method=RequestMethod.POST)
	public ResponseEntity<?> newMeeting(@RequestBody Meeting input)
	{
		service.newMeeting(0, input.getName(), input.getRoom(), input.getAttendes());
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(1).toUri());
		return new ResponseEntity<> (null, httpHeaders, HttpStatus.CREATED);
	}
}
