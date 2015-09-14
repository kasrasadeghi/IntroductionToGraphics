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
public class SimpleRadar
{
    private double startAngle;
    private int numBlocks;
    private int innerRadius, outerRadius;
    
    public SimpleRadar( int nb, int r, int R )
    {
        startAngle = 0;
        numBlocks = nb;
        innerRadius = r;
        outerRadius = R;
    }
    
    public int getStartAngle() { return (int)startAngle; }
    public int getNumBlocks() { return numBlocks; }
    public int getInnerRadius() { return innerRadius; }
    public int getOuterRadius() { return outerRadius; }
    
    public void rotate( int dt )
    {
        startAngle += dt/100.0;
    }
}
