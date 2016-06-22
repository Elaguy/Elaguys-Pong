package schultz.personal.pong;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.*;

public class Sound {
	
	public void playSound(String src) {
		try {
			Clip clip = AudioSystem.getClip();
			BufferedInputStream buffInput = new BufferedInputStream(this.getClass().getResourceAsStream(src));
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(buffInput);
			clip.open(audioStream);
			clip.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
