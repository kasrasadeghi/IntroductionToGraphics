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
        // draw a red square centered at Cx, Cy with side length size
        g.setColor( Color.RED );
        g.fillRect( Cx - size/2, Cy - size/2, size, size );
        
        // draw a yellow door
        // the door should be size/4 pixels wide and size/2 pixels tall
        // centered on the red square horizontally
        // aligned with the bottom of the square vertically
        // outline the door in black
        
        
        // draw a blue triangle for the roof.  Don't forget the functions
        // fillTriangle and drawTriangle in class GraphicsHelperFunctions
        // The base of the triangle should be the same size as the red square
        // The height of the triangle should be size/2
        // outline the triangle in black
        
        
        // add two windows to the body of the house
        // both should be white
        // The first should be square, centered on the top left quarter of the house, and have a width
        // of 1/4 the width of the house
        // The second should be round, centered on the top right quarter of the house and also have
        // a width of 1/4 the width of the house
        // Both windows should be outlined in black and have black vertical and horizontal cross beams
        
        
        // finally, draw a black door knob on the door.  It should be aligned with the right side of the door
        // centered vertically on the door, and be 1/4 the width of the door
        
        
    }
    
    @Override
    public void paint(Integer [] size, Graphics g, int w, int h)
    {
        paintHouse( size[0], size[1], size[2], g );
    }
    
}
