package meetings;

public class MeetingID {
	private static MeetingID instance=null;
	private int id;

	private MeetingID()
	{
		id=1;
	}
	
	public static MeetingID getInstance()
	{
		if (instance==null)
		{
			instance=new MeetingID();
		}
		return instance;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void updateId()
	{
		id+=1;
	}
	
	public void resetId()
	{
		id=1;
	}
}
