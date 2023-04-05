import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Finish extends World
{
    Counter counter = new Counter();
    public Counter getCounter()
    {
         return counter;      
    }
    public Finish()
    {    
        super(1200, 800, 1); 
        addObject(counter,587,429);
        Replay replay1 = new Replay();
        addObject(replay1,490,592);
        Home home1 = new Home();
        addObject(home1,660,594);
        Timeer timer1 = new Timeer();
        addObject(timer1,586,456);
        Highscore high = new Highscore();
        addObject(high,585,402);
    }
}

