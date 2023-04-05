import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class wolf_1 extends portal
{
    public void act() 
    {
        Actor wolf = getOneIntersectingObject(wolf.class);
        if(wolf!=null)
        {
            World myWorld = getWorld();
            level2 Level = (level2)myWorld;
            Counter counter2 = Level.getCounter();
            counter2.addScore();
            counter2.addScore();
            myWorld.removeObject(this);
        }    
    }
}

