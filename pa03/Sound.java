package pa03;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound extends CircleShape{
	public Sound(){
    	super();
		this.color = new java.awt.Color(255,255,255); 
  	}
	
	public static void Suv(){
		File Clap = new File("2614.WAV");
		PlaySound(Clap);
	}

	public static void PlaySound(File Sound){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}catch (Exception e){

		}
	}8

	public void keepOnBoard(){
      if (this.x < this.radius) {
      super.keepOnBoard();
      Suv();

    }else if (this.x > CircleShape.boardWidth-this.radius) {
      super.keepOnBoard();
      Suv();
    }

    if (this.y < this.radius){
      super.keepOnBoard();
      Suv();

    } else if (this.y > CircleShape.boardHeight-this.radius) {
      super.keepOnBoard();
      Suv();
    }
  }
}