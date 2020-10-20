
import java.io.*; 
import sun.audio.*;

class Demo {

	public static void main(String[] args) {
    	try{
    		FileInputStream in=new FileInputStream(new File("kbc.wav"));
    		AudioStream audio=new AudioStream(in);
    		AudioPlayer.player.start(audio);
    	}
    	catch(Exception e1){}
	}
}
