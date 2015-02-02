package meetings;

public class MeetingsServiceFactory {

	private MeetingsServiceFactory()
	{

	}
	
	public static MeetingsService getLocalService()
	{
		return new MeetingsServiceImplementation();
	}
}
