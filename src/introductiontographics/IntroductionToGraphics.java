/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontographics;

import apcscvm.CVMProgram;
import apcscvm.DefaultControl;
import java.awt.Color;

/**
 *
 * @author DSTIGANT
 */
public class IntroductionToGraphics
{
    public static void main(String[] args)
    {
//        runBasicHouse();
//        runBouncingBall();
//        runPacMan();
//        runTargetRectangle();
//        runPulseHouse();
//        runBouncingBalls();
//        
//        runSmileyFace();
//        runRainbow();
//        runSnakeCursor();
//        runAmericanFlag();
//        runSimpleRadar();
//        runRadar();
        runSmoothRainbow();

    }
    
    public static void runBasicHouse()
    {
        Integer [] size = { 100, 200, 300 };
        new CVMProgram( "House", 800, 600, new DefaultControl(), new HouseDisplay(), size ).start();
    
    }
    
    public static void runPulseHouse()
    {
        Integer [] size = { 100, 400, 300 };
        new CVMProgram( "Pulsing House", 800, 600, new HousePulseController(), new HouseDisplay(), size ).start();
    }
    
    public static void runBouncingBall()
    {
        new CVMProgram( "Bouncing Ball", 800, 600, new AnimationControl<BouncingBall>("move"), new BouncingBallDisplay(),
                new BouncingBall( 400, 300, 20, 40, -20, Color.BLUE ) 
        ).start();
    }
    
    public static void runBouncingBalls()
    {
        BouncingBall [] m = new BouncingBall[100];
        for ( int i = 0; i < m.length; i++ )
        {
            m[i] = new BouncingBall( 
                    Math.random() * 800, 
                    Math.random() * 600, 
                    Math.random() * 30 + 10,
                    Math.random() * 100 - 50,
                    Math.random() * 100 - 50,
                    new Color( (int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256 ) ) 
            );
        }
        
        BouncingBallsCV cv = new BouncingBallsCV();
        new CVMProgram( "Bouncing Ball Mayham", 800, 600, cv, cv, m ).start();
    }
    
    public static void runTargetRectangle()
    {
        Integer [] m = new Integer[2];
        m[0] = 4;
        m[1] = 5;
        
        new CVMProgram( "Target Rectangle", 800, 600, new DefaultControl(), new TargetRectangleDisplay(), m ).start();
    }
    
    public static void runRadar()
    {
        int [] sc = { 8, 6, 5, 4 };
        int [] sp = { 1, 2, -3, 4 };
        Radar r = new Radar( 200, sc, sp );
        
        new CVMProgram( "Radar", 800, 600, new AnimationControl<Radar>( "rotate" ), new RadarDisplay(), r ).start();
    }
    
    public static void runAmericanFlag()
    {
        Integer [] m = { 700, 500 };
        new CVMProgram( "American Flag", 800, 600, new DefaultControl(), new AmericanFlag(), m ).start();
    }
    
    public static void runPacMan()
    {
        new CVMProgram( "PacMan", 800, 600, new AnimationControl<PacMan>("gobble"), new PacManDisplay(), new PacMan(100) ).start();
    }
    
    public static void runSnakeCursor()
    {
        new CVMProgram( "Snake Cursor", 800, 600, new SnakeCursorControl(), new SnakeCursorDisplay(), new SnakeCursor( 10) ).start();
    }
    
    public static void runSmileyFace()
    {
        new CVMProgram( "Have a nice day!", 800, 600, new DefaultControl(), new SmileyFace(), 100 ).start();
    }
    
    public static void runRainbow()
    {
        new CVMProgram( "Rainbow", 800, 600, new DefaultControl(), new Rainbow(), 200 ).start();
    }
    
    public static void runSmoothRainbow()
    {
        new CVMProgram( "Smooth Rainbow", 800, 600, new DefaultControl(), new SmoothRainbow(), 200).start();
    }
    
    public static void runSimpleRadar()
    {
        new CVMProgram( "Simple Radar", 800, 600, new AnimationControl<SimpleRadar>("rotate"), new SimpleRadarDisplay(), new SimpleRadar( 5, 100, 200 ) ).start();
    }
    
    
}
