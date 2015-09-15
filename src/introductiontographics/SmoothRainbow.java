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
public class SmoothRainbow implements View<Integer>
{
    
    double freq = .2;
    @Override
    public void paint(Integer m, Graphics g, int w, int h) 
    {
        
        // This is a bonus... you're on your own.
        int r = m;
        int d = 2*m;
        int cx = w/2;
        int cy = h/2;
        
        for (int i = 0; i < 100; ++i) {
            Color phaser = new Color(getRed(i), getGreen(i), getBlue(i));
            g.setColor(phaser);
            g.fillRect(i*10, 0, 10, 50 );
        }
        
    }
    double c = 0.3;
    public int getRed(int i )
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a+0 + c)*(127)+127);
    }
    
    public int getBlue(int i )
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a + c + 4*Math.PI/3.0)*127+127);
    }
    
    public int getGreen(int i)
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a + c + 2*Math.PI/3.0)*127+127);
    }
}
