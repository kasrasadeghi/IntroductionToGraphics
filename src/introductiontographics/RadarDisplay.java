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
public class RadarDisplay implements View<Radar>
{

    @Override
    public void paint(Radar m, Graphics g, int w, int h)
    {
        // draw a multi-ringed radar
        
        // first calculate the width of each ring = total radius / number of rings
        
        
        // since there are multiple rings, use a for loop to draw each ring ...
        
            //and since there are multiple blocks in each ring, use a nested for loop to draw each segment
                // each segment consists of a filled arc... where should it start and what should it's extent be?
                // you can calculate these answers from the start angle for the ring and the number of segments
                // in the ring
        
    }
    
}
