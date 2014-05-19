package engine;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
//import resources.*;


/**
 * <p>
 * This enumerator serves to hold all of the BufferedImage files which the game will use.
 * <br>
 * There also is a toString method which will return the name of a desired constant.
 * @author Nicholas Johnson
 *
 */
public enum EnumImage {
	MAINMENU(new File("")), //contain the menu
	LEVEL1(new File("")), //contain level 1
	LEVEL2(new File("")), //contain level 2
	LEVEL3(new File("")),//contain level 3
	MOB1(new File(""),"MOB"),//placeholder for a mob
	//Hawk
	HAWK_ATTACK(new File(""), "HAWK_ATTACK"),
	HAWK_CRIT(new File(""),"HAWK_CRIT"),
	HAWK_IDLE_1(new File(""),"Hawk","HAWK_IDLE_1"),
	HAWK_IDLE_2(new File(""),"Hawk","HAWK_IDLE_2"),
	HAWK_IDLE_3(new File(""),"Hawk","HAWK_IDLE_3"),
	HAWK_IDLE_4(new File(""),"Hawk", "HAWK_IDLE_4"),
	//small bird
	BIRD_IDLE_1_LEFT(new File(""),"Small Bird","BIRD_IDLE_1_LEFT"),
	BIRD_IDLE_2_LEFT(new File(""),"Small Bird","BIRD_IDLE_2_LEFT"),
	BIRD_IDLE_3_LEFT(new File(""),"Small Bird","BIRD_IDLE_3_LEFT"),
	BIRD_IDLE_1_RIGHT(new File(""),"Small Bird","BIRD_IDLE_1_RIGHT"),
	BIRD_IDLE_2_RIGHT(new File(""),"Small Bird","BIRD_IDLE_2_RIGHT"),
	BIRD_IDLE_3_RIGHT(new File(""),"Small Bird","BIRD_IDLE_3_RIGHT"),
	//other mob
	//static mob/boundary
	//mainCharacter
	CUSTOM_PLAYER(new File(""),"PLAYER");
	
	
	BufferedImage image ;	// save the image file in this variable
	String 	name,			//name of the constant if there is one.
			frameName;		//name of the frame of a constant if there is one
	
	EnumImage(File pic){
		try {
			image = ImageIO.read(pic);
		} catch(IOException e) {
			e.printStackTrace();
		}
		name = "Background Image";
		this.frameName=null;
	}
	
	EnumImage(File pic, String name){
		try {
			image = ImageIO.read(pic);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		this.name=name;
		this.frameName=null;
		
	}
	
	EnumImage(File pic, String name, String frameName){
		try {
			image = ImageIO.read(pic);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		this.name=name;
		this.frameName=frameName;
		
	}
	
	/**
	 * @return the name of the constant in the format of, "Object (constant name) on frame (frame name)".
	 */
	@Override
	public String toString() {
		return "Object "+this.name+" on frame "+this.frameName;
	}
	
}
