/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontographics;

import java.awt.Graphics;

/**
 *
 * @author DSTIGANT
 */
public class GraphicsHelperFunctions
{
    public static void fillTriangle( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3 )
    {
        int [] xs = new int[3];
        int [] ys = new int[3];
        xs[0] = x1;
        xs[1] = x2;
        xs[2] = x3;
        ys[0] = y1;
        ys[1] = y2;
        ys[2] = y3;
        
        g.fillPolygon( xs, ys, 3 );
    }
    
    public static void drawTriangle( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3 )
    {
        int [] xs = new int[3];
        int [] ys = new int[3];
        xs[0] = x1;
        xs[1] = x2;
        xs[2] = x3;
        ys[0] = y1;
        ys[1] = y2;
        ys[2] = y3;
        
        g.drawPolygon( xs, ys, 3 );
    }
    
    public static void fillStar( Graphics g, int x, int y, double r )
    {
        double r2 = r*2 / (3 + Math.sqrt(5));
        int [] xs = new int[10];
        int [] ys = new int[10];
        
        for ( int i = 0; i < 5; i++ )
        {
            xs[2*i] = (int)(x + r*Math.cos( Math.PI/2 + i*2*Math.PI/5 ));
            xs[2*i+1] = (int)(x + r2*Math.cos( 7*Math.PI/10 + i*2*Math.PI/5 ));
            ys[2*i] = (int)(y - r*Math.sin( Math.PI/2 + i*2*Math.PI/5 ));
            ys[2*i+1] = (int)(y - r2*Math.sin( 7*Math.PI/10 + i*2*Math.PI/5 ));

        }
        
        g.fillPolygon( xs, ys, 10 );
        g.drawPolygon( xs, ys, 10 );
    
    }
}
