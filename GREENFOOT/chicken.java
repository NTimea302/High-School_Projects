import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class chicken extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor fox = getOneIntersectingObject(fox.class);
        if(fox!=null)
        {
            World myWorld = getWorld();
            level1 Level = (level1)myWorld;
            Counter counter = Level.getCounter();
            while(number<10)
            {
                counter.addScore();
                number++;
            }
            myWorld.removeObject(this);
        }
    }    
}
