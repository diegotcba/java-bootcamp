
public interface AudioPlayerSubject {
	
	public void addObserver(AudioPlayerObserver observer);
	public void removeObserver(AudioPlayerObserver observer);
	public void doNotify();

}
