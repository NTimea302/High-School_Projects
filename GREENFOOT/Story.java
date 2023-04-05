import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Story extends World
{

    /**
     * Constructor for objects of class Story.
     * 
     */
    public Story()
    {    
      super(1200, 800, 1);
      Back back = new Back();
      addObject(back,1025,734);
    }
}
