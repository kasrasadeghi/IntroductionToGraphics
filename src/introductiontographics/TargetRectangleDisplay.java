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
public class TargetRectangleDisplay implements View<Integer[]>
{

    private void paintTargets( int numRows, int numCols, Graphics g, int w, int h )
    {
        // draw a rectangular array of blue and yellow targets
        // the array should have numRows rows and numCols columns
        
        // the radius should be the smaller of w/(2*numCols) and h/(2*numRows)
        
        // since there are several rows, use a for looop to draw each row
        
            // each row consists of several targets, so use a (nested) for loop to draw the individual targets
            
                // calculate the location of each target from the row and column number
                // draw a blue circle and a yellow circle with half the radius
                
                // outline both circles in black
                
          
    }
    
    @Override
    public void paint(Integer[] m, Graphics g, int w, int h)
    {
        paintTargets( m[0], m[1], g, w, h );
    }
    
}