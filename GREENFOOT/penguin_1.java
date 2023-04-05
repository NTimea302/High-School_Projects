import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class penguin_1 extends portal
{
    public void act() 
    {
        Actor penguin = getOneIntersectingObject(penguin.class);
        if(penguin!=null)
        {
            World myWorld = getWorld();
            level3 Level = (level3)myWorld;
            Counter counter2 = Level.getCounter();
            counter2.addScore();
            counter2.addScore();
            myWorld.removeObject(this);
        }    
    }
}
