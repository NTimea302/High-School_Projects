import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class rabbit extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor wolf = getOneIntersectingObject(wolf.class);
        if(wolf!=null)
        {
            World myWorld = getWorld();
            level2 Level = (level2)myWorld;
            Counter counter2 = Level.getCounter();
            while(number<10)
            {
                counter2.addScore();
                number++;
            }
            myWorld.removeObject(this);
        }
    }    
}
