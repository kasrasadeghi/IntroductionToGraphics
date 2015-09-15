/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introductiontographics;

import apcscvm.View;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DSTIGANT
 */
public class SnakeCursorDisplay implements View<SnakeCursor>
{

    @Override
    public void paint(SnakeCursor sc, Graphics g, int w, int h) 
    {
        // draw a snake cursor which consists of several balls
        
        // since there are several balls, use a for loop to draw each one
        
        int numBall = sc.getNumBalls();
        for (int i = 0; i < numBall; ++i) {
            int cx = sc.getX(i);
            int cy = sc.getY(i);
            int r = sc.getBallRadius(i);
            g.setColor( Color.RED);
            g.fillOval(cx - r, cy - r, 2* r, 2* r);
        }
        // the location and size of each ball is obtained from the snake cursor, sc
            
    }
    
}
