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
        int fh13 = fh / 13;
        int fw13 = fw / 13;
        
        int tlx = w/2 - fw/2;//top left x
        int tly = h/2 - fh/2;//top left y 
        
        for (int i = 0; i < 13; ++i) {
            if (i%2 == 0) g.setColor( Color.RED );
            else g.setColor(Color.WHITE);
            g.fillRect(tlx , tly + fh13 * i, fw, fh13);
        }
        
        // next the blue field... its dimensions are 6fw/13 x 7fh/13 
        g.setColor( Color.BLUE);
        g.fillRect(tlx, tly, 6*fw/13, (7*fh)/13 - 3 );//for some reason the proportions don't work
        
        // next draw the stars...
        // each star has a radius of fw/55 (don't forget about the function fillStar in class GraphicsHelperFunctions
        // the rows of 6 are horizontally indented by BFw/12 and horizontally spaced by BFw/6
        // the rows of 5 are horizontally indented by BFw/6 and horizontally spaced by BFw/6
        // the rows are vertically indented by BFh/18 and vertically spaced by BFh/9
        int BFw = 6 * fw / 13; int BFh = 7 * fh / 13 - 3; 
        double r = fw/55;
        g.setColor(Color.WHITE);
        for (int i = 0; i < 9; ++i) {
            if (i%2 == 0) {
                for (int j = 0; j < 6; ++j)
                    GraphicsHelperFunctions.fillStar(g, tlx + BFw/12 + BFw/6 * j, tly + BFh/18 + BFh/9 * i, r);
            } else {
                for (int j = 0; j < 5; ++j)
                    GraphicsHelperFunctions.fillStar(g, tlx + BFw/6 + BFw/6 * j, tly + BFh/18 + BFh/9 * i, r);
            }
        }
        
        // finally, outline the whole flag in a black rectangle
        g.setColor(Color.BLACK);
        g.drawRect(tlx, tly, fw, fh - 6); // i have no idea why this is happening. maybe a rounding error?
    }    

    
    @Override
    public void paint( Integer[] m, Graphics g, int w, int h )
    {
        paintFlag( m[0], m[1], g, w, h );
    }
    
}
