/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontographics;

import apcscvm.DefaultControl;

/**
 *
 * @author DSTIGANT
 */
public class HousePulseController extends DefaultControl<Integer[]>
{
    boolean increasing = true;
    
    public void handleTimePassage( Integer [] size, int eAge, int dt )
    {
        if ( increasing )
        {
            size[0] += dt / 10;
        }
        else
        {
            size[0] -= dt / 10;
        }
        
        if ( size[0] > 200 )
        {
            increasing = false;
            size[0] = 200;
        }
        else if ( size[0] < 50 )
        {
            increasing = true;
            size[0] = 50;
        }
    }
}
