import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Starfish extends Actor
{
    /**
     * Act - do whatever the Starfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(intersects(getMinigame().getPlayer()))
        {
            getMinigame().addScore(1);
            setLocation(getMinigame().getSpawnX(), getMinigame().getSpawnY());
        }
    }    
    
    private Minigame getMinigame()
    {
        return (Minigame)getWorld();
    }
}
