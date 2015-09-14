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
public class SnakeCursor 
{
    private double[][] ballCoords;
    
    public SnakeCursor( int size )
    {
        ballCoords = new double[2][size];
        for ( int i = 0; i < size; i++ )
        {
            ballCoords[0][i] = 400;
            ballCoords[1][i] = 300;
        }
    }
    
    public int getNumBalls() { return ballCoords[0].length; }
    public int getX( int i ) { return (int)ballCoords[0][i]; }
    public int getY( int i ) { return (int)ballCoords[1][i]; }
    
    public int getBallRadius( int i ) 
    { 
        int nb = getNumBalls();
        return 20*(nb-i)/nb;
    } 
    
    public void setHead( int x, int y )
    {
        ballCoords[0][0] = x;
        ballCoords[1][0] = y;
    }
    
    public void move( int dt )
    {
        double t = dt/300.0;
        
        for ( int i = 1; i < ballCoords[0].length; i++ )
        {
            ballCoords[0][i] = (1-t)*ballCoords[0][i] + t*ballCoords[0][i-1];
            ballCoords[1][i] = (1-t)*ballCoords[1][i] + t*ballCoords[1][i-1];
        }
    }
}
