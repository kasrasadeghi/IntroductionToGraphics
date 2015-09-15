/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introductiontographics;

import apcscvm.View;
import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DSTIGANT
 */
public class PacManDisplay implements View<PacMan>
{

    @Override
    public void paint(PacMan pm, Graphics g, int w, int h) 
    {
        // draw a pacman
        // it should be yellow (of course)
        // the size, location and angle of the mouth can be obtained from the PacMan object, pm
        g.setColor(Color.YELLOW );
        g.fillOval(pm.getX() - pm.getRadius(), pm.getY() - pm.getRadius(), 2*pm.getRadius(), 2*pm.getRadius());
        g.setColor(Color.WHITE);
        g.fillArc(pm.getX() - pm.getRadius(), pm.getY() - pm.getRadius(), 2*pm.getRadius(), 2*pm.getRadius(), pm.getMouthAngle()/2, -pm.getMouthAngle());
    }
    
}
