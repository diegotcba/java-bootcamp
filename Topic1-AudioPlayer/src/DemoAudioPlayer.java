
public class DemoAudioPlayer {
	
	public static void main(String[] args)
	{
		
		System.out.println("AudioPlayer Demo \n");
		
		//Initialization
		System.out.println("\nAudio Player Initialization \n");	
		AudioPlayer audioplayer=new AudioPlayer("Foo Fighters - Everlong.mp3");		
		System.out.println(audioplayer);
		
		System.out.println("\n\nPlaying track \n");		
		audioplayer.play();		
		System.out.println(audioplayer);
		
		System.out.println("\n\nPausing track \n");		
		audioplayer.pause();		
		System.out.println(audioplayer);
		
		System.out.println("\n\nPlaying track \n");		
		audioplayer.play();		
		System.out.println(audioplayer);
		
		System.out.println("\n\nStopping track \n");		
		audioplayer.stop();		
		System.out.println(audioplayer);
		
		System.out.println("\n\nStopping track (stopped previously) \n");		
		audioplayer.stop();		
		System.out.println(audioplayer);
		
	}

}
