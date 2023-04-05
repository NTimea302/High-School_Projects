import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class plant1 extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor raindeer = getOneIntersectingObject(raindeer.class);
        if(raindeer!=null)
        {
            World myWorld = getWorld();
            level5_2 Level = (level5_2)myWorld;
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
