
import java.awt.Graphics2D;

import java.util.Random;
import java.awt.Image;
import java.awt.Rectangle;


import javax.swing.ImageIcon;

public class Stressbooks extends Entity {
	static Random rand = new Random(); 
	private int moveX;
	private int moveY;
	
	int x=rand.nextInt(1300),y=rand.nextInt(50); //randomize starting position of the stressbooks and make sure it only spawns on top to not auto close off spawn


	

		
	
	public Stressbooks (int x, int y){
    	super(x,y);
    	
    	moveX=(int) (Math.random () * 4 + 1);    //randomize speed and movement for each stressbook
    	moveY=(int) (Math.random () * 4 + 1);   
    }
    public void update(){    
    	x+=moveX;
    	y+=moveY;
    	checkCollision();
    }
    public void checkCollision(){
    	if (x+getStressbooksImg().getWidth(null) >1355 ){ 	//1360 is the width of the window
            moveX*=-1;				//changes moveX from 3 to -3
    	}if(x+getStressbooksImg().getWidth(null)<45){
    		moveX*=-1;
    	}if(y+getStressbooksImg().getHeight(null)<42){  //bounce off wall
    		moveY*=-1;
    	}if(y+getStressbooksImg().getHeight(null)>650){
    		moveY*=-1;
    	}
    	BaljeetModel baljeet = GameFrame.getGunterList();
    	
 
        	if (getBounds().intersects(baljeet.getBounds())){	
        		int brother= GameFrame.bruh();    //if it intersects game closes
        		brother=0;
        		System.exit(0); 
    	}
    	

    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,getStressbooksImg().getWidth(null),getStressbooksImg().getHeight(null));
	}
    public void draw(Graphics2D g2d){
        g2d.drawImage(getStressbooksImg(),x,y,null);
    }
    public Image getStressbooksImg(){
       
    	ImageIcon ic=new ImageIcon(getClass().getClassLoader().getResource("stressbooks.png"));
    
        return ic.getImage();
    }

}
