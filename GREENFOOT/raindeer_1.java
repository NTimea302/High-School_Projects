import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class raindeer_1 extends portal
{
    public void act() 
    {
        Actor raindeer = getOneIntersectingObject(raindeer.class);
        if(raindeer!=null)
        {
            World myWorld = getWorld();
            level5_1 Level = (level5_1)myWorld;
            Counter counter2 = Level.getCounter();
            counter2.addScore();
            counter2.addScore();
            myWorld.removeObject(this);
        }    
    }
}