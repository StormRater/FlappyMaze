
import java.awt.Graphics;

/**
 * 
 * <p>
 * This thread will receive information from the Graphics handler and "paint"<br>
 * the images onto the canvas for the Main_Deploy_Thread to display to the user.
 * 
 * @author Nicholas Johnson
 *
 */
public class GraphicsPaintingThread implements Runnable {

	Graphics canvas;
	
	public GraphicsPaintingThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
        //Just to be nice, lower this thread's priority
        //so it can't interfere with other processing going on.
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        //Remember the starting time.
        long startTime = System.currentTimeMillis();
		
        
	}
	
	

}
