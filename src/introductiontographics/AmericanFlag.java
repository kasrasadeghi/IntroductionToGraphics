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
public class AmericanFlag implements View<Integer[]>
{

    public void paintFlag(int fw, int fh, Graphics g, int w, int h)
    {
        // start by drawing the stripes... there are 13, so use a for loop
        
        
        // next the blue field... its dimensions are 6fw/13 x 7fh/13 
        
        
        // next draw the stars...
        // each star has a radius of fw/55 (don't forget about the function fillStar in class GraphicsHelperFunctions
        // the rows of 6 are horizontally indented by BFw/12 and horizontally spaced by BFw/6
        // the rows of 5 are horizontally indented by BFw/6 and horizontally spaced by BFw/6
        // the rows are vertically indented by BFh/18 and vertically spaced by BFh/9
        
        
        // finally, outline the whole flag in a black rectangle
        
    }
    
    public void paint( Integer[] m, Graphics g, int w, int h )
    {
        paintFlag( m[0], m[1], g, w, h );
    }
    
}
