package engine;

import java.awt.Graphics;
import java.util.Random;

public class Engine {

	Random rnd;
	Graphics canvas;
	
	
	public Engine() {
		
		rnd = new Random();
		
		
	}
	
	public void setMappedObjects() {
		
	}
	
	public void setCanvas(Graphics g) {
		this.canvas = g;
	}
	
	

}
