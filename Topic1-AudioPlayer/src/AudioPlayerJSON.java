
public class AudioPlayerJSON implements AudioPlayerObserver {

	@Override
	public void doUpdate(AudioPlayer audioplayer) {
		System.out.println("{\n   \"track\": \"" + audioplayer.getTrack() + "\",\n   \"state\": \"" + audioplayer.getState() + "\"\n}");
	}

}
