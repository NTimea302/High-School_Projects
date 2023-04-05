import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class raspberry extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor bear = getOneIntersectingObject(bear.class);
        if(bear!=null)
        {
            World myWorld = getWorld();
            level4 Level = (level4)myWorld;
            Counter counter = Level.getCounter();
           while(number<15)
           {
               Counter.addScore();
               number++;
            }
            myWorld.removeObject(this);
        }
    }        
}
