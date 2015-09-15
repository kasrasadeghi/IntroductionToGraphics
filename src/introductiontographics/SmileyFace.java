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
public class SmileyFace implements View<Integer>
{

    @Override
    public void paint(Integer r, Graphics g, int w, int h) 
    {
        int cx = w/2;
        int cy = h/2;
        int d = 2* r;
        // draw a smiley face of radius r centered in the center of the window
        
        // the face should be yellow of course
        g.setColor( Color.YELLOW );
        g.fillOval( cx - r, cy - r, d, d);
        // outline the face in black
        g.setColor( Color.BLACK );
        g.drawOval( cx - r, cy - r, d, d);
        // draw the mouth
        g.drawArc( cx - 2*r/3, cy - 2*r/3, 2*d/3, 2*d/3, 210, 120);
        // draw the two eyes
        g.fillOval( cx - r/2, cy - r/2, r/4, r/2);
        g.fillOval( cx + r/4, cy - r/2, r/4, r/2);
    }

    
}
