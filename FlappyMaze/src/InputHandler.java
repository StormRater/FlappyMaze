import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

/**
 * This is the thread that handles all user input for the game.
 * @author Nicholas Johnson
 *
 */
public class InputHandler implements Runnable, MouseInputListener, KeyListener {

	Thread thisHandler;
	
	public InputHandler(ThreadGroup gr) {
		this.thisHandler = new Thread(gr,this,"Input_Listening_Thread");
		gr.list();
	}

	/**
	 * This method calls the GraphicsHandler Thread to update the 
	 * vertical position of the flappy character
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Inform other threads of click and update accordingly
		
		
	}

	/**
	 * This does nothing 
	 */
	@Override
	public void mousePressed(MouseEvent e) {
	}

	/**
	 * This does nothing
	 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
	}

	/**
	 * The game continues.
	 * It restarts the Deploy_Thread, the graphicsHandler thread, and the GraphicsPainting Thread
	 */
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO It will pause the Deploy_Thread, the graphicsHandler 
		//thread, and the GraphicsPainting Thread

	}

	/**
	 * This pauses the game
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Does nothing
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Does nothing
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method tells the graphical thread to update the 
	 * vertical position of the flappy character
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Does nothing
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Does nothing
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

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
