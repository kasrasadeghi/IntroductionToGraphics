/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontographics;

import apcscvm.Control;
import apcscvm.DefaultControl;
import apcscvm.View;
import java.awt.Graphics;

/**
 *
 * @author DSTIGANT
 */
public class BouncingBallsCV extends DefaultControl<BouncingBall[]> implements View<BouncingBall[]>
{
    private BouncingBallDisplay bbd = new BouncingBallDisplay();
    private Control bbc = new AnimationControl<BouncingBall>( "move" );
    
    @Override
    public void paint(BouncingBall[] m, Graphics g, int w, int h)
    {
        for ( BouncingBall b : m )
        {
            bbd.paint( b, g, w, h );
        }
    }
    
    @Override
    public void handleTimePassage( BouncingBall[] m, int eventAge, int dt )
    {
        for ( BouncingBall b : m )
        {
            bbc.handleTimePassage( b, eventAge, dt );
        }
    }
    
}
