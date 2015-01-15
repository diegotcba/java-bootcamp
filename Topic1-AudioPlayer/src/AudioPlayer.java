import java.util.ArrayList;
import java.util.List;


public class AudioPlayer implements AudioPlayerSubject {
	private String track;
	private AudioPlayerState state;
	private List<AudioPlayerObserver> observers;
	

	public AudioPlayer(String track)
	{
		observers=new ArrayList<AudioPlayerObserver>();
		this.setTrack(track);
		this.state=new StoppedState();
	}

	public void play()
	{
		state.play(this);
		doNotify();
	}

	public void stop()
	{
		state.stop(this);
		doNotify();
	}
	
	public void pause()
	{
		state.pause(this);
		doNotify();
	}
	
	public String getTrack() {
		return track;
	}

	public String getState()
	{
		return state.getName();
	}
	
	public String toString()
	{
		return "Track: " + track + "\nState: " + state.getName();
	}
	
	public void setTrack(String track) {
		this.track = track;
	}
	
	public void setState(AudioPlayerState state)
	{
		this.state=state;
	}

	@Override
	public void addObserver(AudioPlayerObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(AudioPlayerObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void doNotify() {
		// TODO Auto-generated method stub
		for(AudioPlayerObserver obs : observers)
		{
			obs.doUpdate(this);
		}
		
	}
	
	
}
