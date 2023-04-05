import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Buttons
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this))
            Greenfoot.setWorld(new level1());
        Timeer.mark();
    }  
}    

