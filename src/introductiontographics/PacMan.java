/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introductiontographics;

/**
 *
 * @author DSTIGANT
 */
public class PacMan 
{
    private int radius;
    private int mouthAngle;
    private boolean opening;
    double x, y;
    
    public PacMan( int r )
    {
        radius = r;
        mouthAngle = 90;
        opening = false;
        x = 400;
        y = 300;
    }
    
    public int getMouthAngle() { return mouthAngle; }
    public int getRadius() { return radius; }
    public int getX() { return (int)x; }
    public int getY() { return (int)y; }
    
    public void gobble( int dt )
    {
        int da = dt / 10;
        if ( opening )
        {
            mouthAngle += da;
        }
        else
        {
            mouthAngle -= da;
        }
        x += dt / 30.0; 
        
        if ( mouthAngle > 90 )
        {
            mouthAngle = 90;
            opening = false;
        }
        else if ( mouthAngle < 0 )
        {
            mouthAngle = 0;
            opening = true;
        }
        
        if ( x > 800 + radius )
        {
            x = -radius;
        }
    }
}
