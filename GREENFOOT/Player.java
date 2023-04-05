import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    int speed = 12;
    int turnSpeed = 9;
    int playerNumber;
    int savedX;
    int savedY;
    public void act() 
    {
        if(getMinigame().getGameState() == Minigame.GAME_STATE.RUNNING)
        {
            move(speed);
            if(isKeyDown("left")) turn(turnSpeed * -1);
            if(isKeyDown("right")) turn(turnSpeed);
            if(getX() < 1 || getX() > getWorld().getWidth() - 2 || getY() < 1 || getY() > getWorld().getHeight() - 1 - getMinigame().getInfo().getImage().getHeight()){
                resetPos();
                getMinigame().subLive();
                getMinigame().setScore(getMinigame().getScore() / 2);
            }
        }
    }

    public void addedToWorld(World world)
    {
        savedX = getX();
        savedY = getY();
    }

    public void resetPos()
    {
        setLocation(savedX, savedY);
    }

    public Player(int playerNumber)
    {
        this.playerNumber = playerNumber;
    }

    public boolean isKeyDown(String key)
    {
        return Greenfoot.isKeyDown(key);
    }

    public void move(int speed)
    {
        super.move(speed);
        if(getY() > getWorld().getHeight() - getMinigame().getInfo().getImage().getHeight())
        {
            setLocation(getX(), getWorld().getHeight() - getMinigame().getInfo().getImage().getHeight());
        }
    }

    private Minigame getMinigame()
    {
        return (Minigame)getWorld();
    }
}
