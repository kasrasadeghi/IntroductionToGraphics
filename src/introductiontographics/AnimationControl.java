/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package introductiontographics;

import apcscvm.DefaultControl;
import java.lang.reflect.Method;

/**
 *
 * @author DSTIGANT
 */
public class AnimationControl<T> extends DefaultControl<T>
{
    private String animationMethodName;
    private Method meth;
    
    public AnimationControl( String amn )
    {
        animationMethodName = amn;
        meth = null;
    }
    
    public void handleTimePassage( T m, int ea, int dt )
    {
        try
        {
            if ( meth == null )
            {
                meth = m.getClass().getMethod( animationMethodName, int.class );
            }
            
            meth.invoke( m, dt );
        }
        catch( Exception e )
        {
            System.err.println( e );
        }
    }
}
