/*
 * Copyright (c) 1995-1997 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
import java.awt.*;
import java.applet.Applet;

/* 
 * Based on Arthur van Hoff's animation examples, this applet
 * can serve as a template for all animation applets.
 */

public class AnimatorApplet extends Applet implements Runnable {
    int frameNumber = -1;
    int delay;
    Thread animatorThread;
    boolean frozen = false;

    public void init() {
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

    public void start() {
        if (frozen) { 
            //Do nothing.  The user has requested that we 
            //stop changing the image.
        } else {
            //Start animating!
            if (animatorThread == null) {
                animatorThread = new Thread(this);
            }
            animatorThread.start();
        }
    }

    public void stop() {
        //Stop the animating thread.
        animatorThread = null;
    }

    public boolean mouseDown(Event e, int x, int y) {
        if (frozen) {
            frozen = false;
            start();
        } else {
            frozen = true;
            stop();
        }
        return true;
    }

    public void run() {
        //Just to be nice, lower this thread's priority
        //so it can't interfere with other processing going on.
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        //Remember the starting time.
        long startTime = System.currentTimeMillis();

        //This is the animation loop.
        while (Thread.currentThread() == animatorThread) {
            //Advance the animation frame.
            frameNumber++;

            //Display it.
            repaint();

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

    //Draw the current frame of animation.
    public void paint(Graphics g) {
        g.drawString("Frame " + frameNumber, 0, 30);
    }
}
