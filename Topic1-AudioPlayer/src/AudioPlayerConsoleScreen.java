
public class AudioPlayerConsoleScreen implements AudioPlayerObserver {

	@Override
	public void doUpdate(AudioPlayer audioPlayer) {
		System.out.println("The track \"" + audioPlayer.getTrack() + "\" is " + audioPlayer.getState()+"\n");
	}

}
