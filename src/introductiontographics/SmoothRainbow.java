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
    
    double freq = .01;
    @Override
    public void paint(Integer m, Graphics g, int w, int h) 
    {
        
        // This is a bonus... you're on your own.
        int r = m;
        int d = 2*m;
        int cx = w/2;
        int cy = h/2;
        
        int temp = 600;
        for (int i = temp + r/8; i > -1; --i) {
            Color phaser = new Color(getRed(i), getGreen(i), getBlue(i));
            g.setColor(phaser);
            int dr = r * i/ temp;
            //g.fillRect(cx - dr - r/8, cy - r, 1, 1000 );
            
            g.fillOval(cx - dr - r/8, cy - dr - r/8, 2*dr + r/4, 2*dr + r/4);
        }
        g.setColor( Color.WHITE);
        g.fillOval(cx - r/8, cy - r/8, r/4, r/4);
        g.clearRect(cx - r - r/2, cy, 2*r + r, 2*r + r);
        
    }
    double c = 2.1;
    public int getRed(int i )
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a + c)*100 + 150);
    }
    
    public int getGreen(int i)
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a + c + 2* Math.PI/3.0)*110 + 140);
    }
    
    public int getBlue(int i )
    {
        double a = (double)(i);
        return (int)(Math.sin(freq*a + c + 4 * Math.PI/3.0)*110 + 140);
    }
}
