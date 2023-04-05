import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Timeer extends Actor
{
    public static long tim;
    public static long lastMark;
  
    public static void mark()
    {
        lastMark = System.currentTimeMillis();
    }
    
    public int millisElapsed()
    {
        return (int) (System.currentTimeMillis() - lastMark);
    }
    
    public void act()
    {
       if (this.getWorld().getClass() != Finish.class && this.
       getWorld().getClass() != GameOver.class) 
       {
        tim = millisElapsed();
       }
       setImage(new GreenfootImage("Your Time: " + tim/100000 +
       "." + tim/1000 + " minutes" , 24, Color.BLACK, Color.WHITE));
    }
}