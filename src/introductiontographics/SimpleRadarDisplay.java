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
class SimpleRadarDisplay implements View<SimpleRadar>
{

    @Override
    public void paint(SimpleRadar sr, Graphics g, int w, int h)
    {
        // a SimpleRadar consists of one ring of several segments
        // the inner radius and the outer radius are specified by the radar, sr
        
        // since there are several segments, use a for loop to draw them
        
            // the starting angle and extent of each segment can be calculated from the
            // the starting angle of the first segment, the segment number, and the number of segments
        
        int outr = sr.getOuterRadius();
        int inr = sr.getInnerRadius();
        int cx = w/2;
        int cy = h/2;
        int tlx = cx - outr;
        int tly = cy - outr;
        g.setColor( Color.GREEN);
        int theta = 180/sr.getNumBlocks();
        for (int i = 0; i < sr.getNumBlocks(); ++i)  
            g.fillArc(tlx, tly, 2* outr, 2* outr, sr.getStartAngle() + theta * 2 * i, theta);
        g.setColor(Color.WHITE);
        g.fillOval(cx - inr, cy - inr, inr* 2, inr * 2);
    }
    
}
