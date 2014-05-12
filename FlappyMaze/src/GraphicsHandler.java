import java.awt.Graphics;
import java.util.concurrent.Callable;

/**
 * <p>
 * This Thread will handle the different pictures that the different objects use<br><br>
 * 
 * i.e. the menu items (callable will be employed to change from the menu screen
 * to each of the level screens), and the mobs.
 * @author Nicholas Johnson
 *
 */
public class GraphicsHandler implements Runnable, Callable<Graphics> {

	public GraphicsHandler() {
		
	}

	@Override
	public Graphics call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Graphics call(Graphics g) throws Exception {
		
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public Graphics paint(Graphics g) {
		
		
		
		return g;
	}
	
	
	
	
}
