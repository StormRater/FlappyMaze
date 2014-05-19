package engine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class SaveFileHandler {

	static Properties saveFile;
	
	static OutputStream out = null;
	static InputStream in = null;
	
	private SaveFileHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public static void loadGameData(String fileName) {
		
	}
	
	public static void saveGameData() {
		
		try {
			out = new FileOutputStream("config.properties");
			
			saveFile.setProperty("SaveFileName", "MahBrand");
			
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public static void saveGameData(String fileName) {
		
		try {
			out = new FileOutputStream("config"+fileName+".properties");
			
			saveFile.setProperty("SaveFileName", fileName);
						
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
	
	public static Properties loadGameData() {
		
		
		return saveFile;
		
	}
	
	public static void loadGameData1(String s) {

	}
	
	
	
	

}
