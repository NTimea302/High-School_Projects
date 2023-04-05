import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    public GameOver()
    {
        super(1200,800,1);
        Replay replay1 = new Replay();
        addObject(replay1,493,484);
        Home home1 = new Home();
        addObject(home1,672,483);
        Timeer timer = new Timeer();
        addObject(timer,587,366);
    }
}
