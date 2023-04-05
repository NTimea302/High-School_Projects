import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bear_1 extends portal
{
    public void act() 
    {
        Actor bear = getOneIntersectingObject(bear.class);
        if(bear!=null)
        {
            World myWorld = getWorld();
            level4 Level = (level4)myWorld;
            Counter counter2 = Level.getCounter();
            counter2.addScore();
            counter2.addScore();
            myWorld.removeObject(this);
        }    
    }
}
