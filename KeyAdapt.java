import java.awt.event.KeyAdapter;   //note these new key imports
import java.awt.event.KeyEvent;

public class KeyAdapt extends KeyAdapter {
	BaljeetModel b;   //this Class has a variable which will be the baljeet so all keypress
                     //handling happens in GunterModel Class because of the variable’s Ball type
        
	public KeyAdapt(BaljeetModel baljeet){ //the baljeet is received from GameFrame after baljeet is created
		b=baljeet;   //this sets the sent ball as the one being key controlled
	}
	
	public void keyPressed(KeyEvent e){
		b.keyPressed(e);    //method from baljeetModel Class dictates reaction to keystrokes
	}
	public void keyReleased (KeyEvent e) {
		b.keyReleased(e);  //method to react to keyrelease
	}
	
	 
}
