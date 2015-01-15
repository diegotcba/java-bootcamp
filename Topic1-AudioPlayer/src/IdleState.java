
public class IdleState implements AudioPlayerState {
	private String name="idle";
	
	@Override
	public void play(AudioPlayer audioplayer) {
		audioplayer.setState(new PlayingState());
	}

	@Override
	public void stop(AudioPlayer audioplayer) {
		// nothing to do. stay on idle state
	}

	@Override
	public void pause(AudioPlayer audioplayer) {
		// nothing to do. stay on idle state
	}

	@Override
	public String getName() {
		return name;
	}

}
