import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.concurrent.Callable;

import engine.*;
import entity.*;

//TODO the FRAME and AGGRESSIVE objects move on x and y, the
// 		player only moves on the y axis

/**
 * 
 * This is the class for the Display_Thread and is the Main_Thread that runs the game
 * @author Nicholas Johnson
 *
 */
public class Deploy extends Applet implements Runnable, Callable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int frameNumber = -1;
    int delay, x, y, width, height;
    boolean frozen = false;
    
    Thread deployThread;
    InputHandler userInputThread;
    Graphics syncedGraphics;
    
    public ThreadGroup allThreads;
    
	@Override
	public void init() {
		this.setSize(1200, 600);
		//these ints are for the testing of a <3,0> moving box
		x=10;y=500;width=5;height=5;
		
		this.setBackground(Color.blue);//temporary
        this.syncedGraphics = this.getGraphics();
        this.allThreads = new ThreadGroup("FlappyMazeGameThreadGroup");
	
        
        String str;
        int fps = 10;

        //How many milliseconds between frames?
        str = getParameter("fps");
        try {
            if (str != null) {
                fps = Integer.parseInt(str);
            }
        } catch (Exception e) {}
        delay = (fps > 0) ? (1000 / fps) : 100;
        
	}
	
	@Override
	public void start() {
        if (frozen) { 
            //Do nothing.  The user has requested that we 
            //stop changing the image.
        } else {
            //Start animating!
            if (deployThread == null) {
                deployThread = new Thread(this.allThreads,this,"Display_Thread");
                if(userInputThread == null) {
                	this.userInputThread = new InputHandler(this.allThreads);
                }
            }
            deployThread.start();
            userInputThread.run();
            //deployThread.
        }
    }

    @Override
	public void stop() {
        //Stop the animating thread.
    	
        deployThread = null;
    }

	@Override
    public void run() {
        //Just to be nice, lower this thread's priority
        //so it can't interfere with other processing going on.
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        //Remember the starting time.
        long startTime = System.currentTimeMillis();

        //This is the animation loop.
        while (Thread.currentThread() == deployThread) {
            //Advance the animation frame.
            //frameNumber++;

        	//this.userInputThread.
        	
            //Display it.
            repaint();
            //TODO: have other threads interact with this variable
            update(syncedGraphics);

            //Delay depending on how far we are behind.
            try {
                startTime += delay;
                Thread.sleep(Math.max(0, 
                                      startTime-System.currentTimeMillis()));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(++x, y, width, height);
		setCanvas(g);
	}
	
	//TODO: have other threads have access
	public synchronized void setCanvas(Graphics set) {
		this.syncedGraphics=set;
	}

	@Override
	public Boolean call() throws Exception {
		
		return true;
	}
	
	public Boolean call(MouseEvent e) throws Exception{
		
		//determine which MouseEvent is being employed
		
		return null;
		
	}

}
