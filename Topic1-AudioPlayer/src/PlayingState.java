
public class PlayingState implements AudioPlayerState {
	private String name="playing";

	@Override
	public void play(AudioPlayer audioplayer) {
		// nothing to do. stay on playing state
	}

	@Override
	public void stop(AudioPlayer audioplayer) {
		audioplayer.setState(new StoppedState());
	}

	@Override
	public void pause(AudioPlayer audioplayer) {
		audioplayer.setState(new PausedState());
	}

	@Override
	public String getName() {
		return name;
	}
}
