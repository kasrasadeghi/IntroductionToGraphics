/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introductiontographics;

import java.awt.event.MouseEvent;

/**
 *
 * @author DSTIGANT
 */
public class SnakeCursorControl extends AnimationControl<SnakeCursor>
{
    public SnakeCursorControl()
    {
        super( "move" );
        
    }
    
    /*
    public void handleTimePassage( SnakeCursor sc, int eventAge, int dt )
    {
        sc.move( dt );
    }*/
    
    @Override
    public void handleMouseEvent( SnakeCursor sc, int eventAge, MouseEvent me )
    {   
        sc.setHead( me.getX(), me.getY() );
    }
}
