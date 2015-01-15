
public class PausedState implements AudioPlayerState {
	private String name="paused";
	
	@Override
	public void play(AudioPlayer audioplayer) {
		audioplayer.setState(new PlayingState());
	}

	@Override
	public void stop(AudioPlayer audioplayer) {
		audioplayer.setState(new IdleState());
	}

	@Override
	public void pause(AudioPlayer audioplayer) {
		// nothing to do. stay on paused state
	}

	@Override
	public String getName() {
		return name;
	}
}
