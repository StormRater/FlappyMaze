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
	MOB1(new File(""),"MOB")//,//placeholder for a mob
	;
	
	
	BufferedImage image ;	// save the image file in this variable
	String name;			//name of the constant if there is one.
	
	EnumImage(File pic){
		try {
			image = ImageIO.read(pic);
		} catch(IOException e) {
			e.printStackTrace();
		}
		name = "Background Image";
	}
	
	EnumImage(File pic, String name){
		try {
			image = ImageIO.read(pic);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * @return the name of the constant
	 */
	@Override
	public String toString() {
		return name;
		
	}
	
}
