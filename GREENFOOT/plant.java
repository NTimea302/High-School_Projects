import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class plant extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor raindeer = getOneIntersectingObject(raindeer.class);
        if(raindeer!=null)
        {
            World myWorld = getWorld();
            level5_1 Level = (level5_1)myWorld;
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
