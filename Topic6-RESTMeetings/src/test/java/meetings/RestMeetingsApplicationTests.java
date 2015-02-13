package meetings;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.mock.http.MockHttpOutputMessage;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @author Josh Long
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestMeetingsApplication.class)
@WebAppConfiguration
public class RestMeetingsApplicationTests {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    private HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    void setConverters(HttpMessageConverter<?>[] converters) {

        this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream().filter(
                hmc -> hmc instanceof MappingJackson2HttpMessageConverter).findAny().get();

        Assert.assertNotNull("the JSON message converter must not be null",
                this.mappingJackson2HttpMessageConverter);
    }

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void readRooms() throws Exception
    {
    	mockMvc.perform(get("/rooms"))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$", hasSize(3)));
    }
    
    @Test
    public void readAttendees() throws Exception
    {
    	mockMvc.perform(get("/attendees"))
    	.andExpect(status().isOk())
    	.andExpect(content().contentType(contentType))
    	.andExpect(jsonPath("$", hasSize(4)));
    }
    
    

    @Test
    public void createMeeting() throws Exception {
//    	Room room=new Room(5, "The Beatles", 10);
//
//		
//		List<Attendee> attendes=new ArrayList<Attendee>();
//		attendes.add(new Attendee(10, "John", "Lennon"));
//		attendes.add(new Attendee(11, "Ringo", "Starr"));
//		attendes.add(new Attendee(12, "Paul", "McCarney"));
//		attendes.add(new Attendee(13, "George", "Harrison"));

		MeetingsService service=MeetingsServiceFactory.getLocalService();
		Room room=service.getRooms().get(2);
		List<Attendee> attendes=new ArrayList<Attendee>();
		attendes.add(service.getAttendees().get(2));
		attendes.add(service.getAttendees().get(3));
    	
        String meetingJson = json(new Meeting(1, "Kickoff Meeting", room, attendes));
        this.mockMvc.perform(post("/meetings")
                .contentType(contentType)
                .content(meetingJson))
                .andExpect(status().isCreated());
        

    }

    protected String json(Object o) throws IOException {
        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
        this.mappingJackson2HttpMessageConverter.write(o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
        return mockHttpOutputMessage.getBodyAsString();
    }
}
