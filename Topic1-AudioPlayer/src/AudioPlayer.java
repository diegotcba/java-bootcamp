
public class AudioPlayer {
	private String track;
	private AudioPlayerState state;
	

	public AudioPlayer(String track)
	{
		this.setTrack(track);
		this.state=new IdleState();
	}

	public void play()
	{
		state.play(this);
	}

	public void stop()
	{
		state.stop(this);
	}
	
	public void pause()
	{
		state.pause(this);
	}
	
	public String getTrack() {
		return track;
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
	
	
}
