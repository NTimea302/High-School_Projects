import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Back extends Buttons
{
    private boolean mouseDown;
    public void act() 
    {
        if (!mouseDown && Greenfoot.mousePressed(this)) 
        mouseDown = true;
        if (mouseDown && Greenfoot.mouseClicked(null)) 
        mouseDown = false;
        if (mouseDown == true)
        {
         Greenfoot.playSound("onclick.mp3");
         setImage("left2.png");
         Greenfoot.setWorld(new Start());
        }
         else
         setImage("left.png");
    }    
}
