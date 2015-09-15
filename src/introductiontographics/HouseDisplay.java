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
public class HouseDisplay implements View<Integer[]>
{

    protected void paintHouse( int size, int Cx, int Cy, Graphics g )
    {
        g.setColor( Color.cyan );
        g.fillRect( Cx - 2* size, Cy - 2* size, 4* size, 4* size);
        
        g.setColor( Color.GREEN );
        g.fillRect( Cx - 2* size, Cy + size/2, 4* size, 2* size);
        //g.fillRect( );
        int bw = 1;
        // draw a red square centered at Cx, Cy with side length size
        g.setColor( Color.RED );
        g.fillRect( Cx - size/2, Cy - size/2, size, size );
        g.setColor( Color.BLACK );
        for (int i = 0; i < bw; i++)
            g.drawRect( Cx - size/2 + i, Cy - size/2 + i, size - 2*i, size - 2*i );
        
        // draw a yellow door
        // the door should be size/4 pixels wide and size/2 pixels tall
        // centered on the red square horizontally
        // aligned with the bottom of the square vertically
        // outline the door in black
        
        g.setColor( Color.YELLOW );
        g.fillRect(Cx - size/8, Cy, size/4, size/2);
        
        g.setColor( Color.BLACK );
        for (int i = 0; i < bw; i++)
            g.drawRect(Cx - size/8 + i, Cy + i, size/4 - 2*i , size/2 - 2*i);
        
        // draw chimney i guess
        g.setColor( Color.YELLOW );
        g.fillRect( Cx - (3*size)/8, Cy - size, size/6, size/2);
        g.setColor( Color.BLACK );
        g.drawRect( Cx - (3*size)/8, Cy - size, size/6, size/2);
        
        
        // draw a blue triangle for the roof.  Don't forget the functions
        // fillTriangle and drawTriangle in class GraphicsHelperFunctions
        // The base of the triangle should be the same size as the red square
        // The height of the triangle should be size/2
        // outline the triangle in black
        g.setColor( Color.BLUE );
        
        GraphicsHelperFunctions.fillTriangle(g, Cx - size/2, Cy - size/2, Cx, Cy - size, Cx + size/2, Cy - size/2 );
        g.setColor( Color.BLACK );
        GraphicsHelperFunctions.drawTriangle(g, Cx - size/2, Cy - size/2, Cx, Cy - size, Cx + size/2, Cy - size/2 );
        
        // add two windows to the body of the house
        // both should be white
        // The first should be square, centered on the top left quarter of the house, and have a width
        // of 1/4 the width of the house
        // The second should be round, centered on the top right quarter of the house and also have
        // a width of 1/4 the width of the house
        // Both windows should be outlined in black and have black vertical and horizontal cross beams
        
        g.setColor( Color.WHITE );
        g.fillRect(Cx - (3*size)/8, Cy - (3*size)/8, size/4, size/4 );
        g.fillOval(Cx + size/8, Cy - (3*size)/8, size/4, size/4);
        
        g.setColor( Color.BLACK );
        g.drawRect(Cx - (3*size)/8, Cy - (3*size)/8, size/4, size/4 );
        g.drawOval(Cx + size/8, Cy - (3*size)/8, size/4, size/4);
        
        g.drawRect(Cx - (3*size)/8, Cy - (3*size)/8, size/8, size/4 );
        g.drawRect(Cx - (3*size)/8, Cy - (3*size)/8, size/4, size/8 );
        
        g.drawLine(Cx + size/8, Cy - size/4, Cx + (3*size)/8, Cy - size/4);
        g.drawLine(Cx + size/4, Cy - (3*size)/8, Cx + size/4, Cy - size/8 );
        
        
        // finally, draw a black door knob on the door.  It should be aligned with the right side of the door
        // centered vertically on the door, and be 1/4 the width of the door
        int a = Cx + size/8;
        int b = Cy + size/4;
        g.drawOval(a - size/16, b - size/32, size/16, size/16);
        
        
    }
    
    @Override
    public void paint(Integer [] size, Graphics g, int w, int h)
    {
        paintHouse( size[0], size[1], size[2], g );
    }
    
}
