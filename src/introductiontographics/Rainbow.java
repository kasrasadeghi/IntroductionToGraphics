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
public class Rainbow implements View<Integer>
{

    @Override
    public void paint(Integer r, Graphics g, int w, int h) 
    {
        // paint a rainbow with radius r centered at the center of the window
        // each of the 7 bands should be r/8 pixels wide (leaving an empty semi circle of width r/8 at the center)
        int r0 = r;
        int r8 = r/8;
        int d = 2*r;
        int cx = w/2;
        int cy = h/2;
        g.setColor( Color.RED );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        g.setColor( Color.ORANGE );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        g.setColor( Color.YELLOW );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        g.setColor( Color.GREEN );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        g.setColor( Color.BLUE );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        Color violet = new Color(128, 0, 255);
        g.setColor( violet );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8;d = 2*r;
        Color indigo = new Color(128, 0, 128);
        g.setColor( indigo );
        g.fillOval( cx - r, cy - r, d, d);
        r = r-r8; d = 2*r;
        g.setColor( Color.WHITE );
        g.fillOval( cx - r, cy - r, d, d);
        r = r0;d = 2*r;
        g.clearRect( cx - r, cy, d, d);
    }
    
}
