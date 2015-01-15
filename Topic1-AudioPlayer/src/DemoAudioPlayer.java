
public class DemoAudioPlayer {
	
	public static void main(String[] args)
	{
		
		System.out.println("AudioPlayer Demo \n");
		
		//Initialization
		System.out.println("\nAudio Player Initialization \n");	
		AudioPlayer audioPlayer=new AudioPlayer("Foo Fighters - Everlong.mp3");		
		System.out.println(audioPlayer);
		
		AudioPlayerConsoleScreen screen=new AudioPlayerConsoleScreen();
		AudioPlayerJSON json=new AudioPlayerJSON();
		
		audioPlayer.addObserver(screen);
		audioPlayer.addObserver(json);
		
		System.out.println("\n\nPlaying track \n");		
		audioPlayer.play();		
		
		System.out.println("\n\nPausing track \n");		
		audioPlayer.pause();		
		
		System.out.println("\n\nPlaying track \n");		
		audioPlayer.play();		
		
		System.out.println("\n\nStopping track \n");		
		audioPlayer.stop();
		
		audioPlayer.removeObserver(screen);
		
		System.out.println("\n\nStopping track (stopped previously) \n");		
		audioPlayer.stop();		
		
	}

}
