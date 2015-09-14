/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontographics;

import java.awt.Color;

/**
 *
 * @author DSTIGANT
 */
public class BouncingBall
{
    private double x, y, r, vx, vy;
    private Color color;
    
    public BouncingBall( double X, double Y, double R, double VX, double VY, Color C )
    {
        x = X;
        y = Y;
        r = R;
        vx = VX;
        vy = VY;
        color = C;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return r; }
    public Color getColor() { return color; }
    
    public void move( int dt )
    {
        x += vx * dt / 1000;
        y += vy * dt / 1000;
        
        if ( x < r || x > 800-r )
        {
            vx *= -1;
            if ( x < r ) x = r;
            if ( x > 800 - r ) x = 800 - r;
        }
        
        if ( y < r || y > 600 - r )
        {
            vy *= -1;
            if ( y < r ) y = r;
            if ( y > 600 - r ) y = 600 - r;
        }
    }
}
