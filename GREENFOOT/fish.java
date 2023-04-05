import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fish extends mainpoints
{
    int number=0;
    public void act() 
    {
        Actor penguin = getOneIntersectingObject(penguin.class);
        if(penguin!=null)
        {
            World myWorld = getWorld();
            level3 Level = (level3)myWorld;
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
