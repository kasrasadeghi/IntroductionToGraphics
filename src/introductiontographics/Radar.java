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
public class Radar
{
    private double [] startAngles;
    private int [] groupCounts;
    private int [] speeds;
    
    private int radius;
    
    public Radar( int r, int [] gc, int [] s )
    {
        radius = r;
        groupCounts = new int[gc.length];
        startAngles = new double[gc.length];
        speeds = new int[gc.length];
        for ( int i = 0; i < gc.length; i++ )
        {
            groupCounts[i] = gc[i];
            startAngles[i] = 0;
            speeds[i] = s[i];
        }
    }
    
    public int getRadius() { return radius; }
    public int getNumRings() { return groupCounts.length; }
    public int getNumSegments( int r ) { return groupCounts[r]; }
    public int getStartAngle( int r ) { return (int)startAngles[r]; }
    
    public void rotate( int dt )
    {
        for ( int i = 0; i < startAngles.length; i++ )
        {
            startAngles[i] += dt * speeds[i] / 100.0;
        }
    }
}
