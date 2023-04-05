import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class raindeer extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    boolean touchingHunter = false;
    int number = 0;
    public raindeer()
    {
        velocity = 0; 
    }
    public void act()
    {   fall();
        if(Greenfoot.isKeyDown("space") && isOnSolidGround()) jump();
        move();
        detectPortal();
        hitHunter();
    } 
         public void fall() 
    {
          setLocation(getX(), getY() + velocity);
          if(isOnSolidGround())
              velocity = 0;
          else 
          if(velocity <0 && didBumpHead()) 
              velocity = 0;
          else 
              velocity += GRAVITY;
    }
    public void jump()
      {
          velocity = -14;
      }
    public void move()
    {
          int y = getY();
          int x = getX();
          if(Greenfoot.isKeyDown("left")) 
          {
              x = x-3;
              setImage(new GreenfootImage("raindeer2.png"));
          }
          if(Greenfoot.isKeyDown("right")) 
          {
              x = x+3;
              setImage(new GreenfootImage("raindeer1.png"));
          }
          setLocation(x, y);
    }
    public boolean isOnSolidGround ()
    { 
        boolean isOnGround = false;
        if(getY() > getWorld().getHeight()-50)
            isOnGround = true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, asd.class) != null || getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, asd.class) != null)
            isOnGround = true;
        return isOnGround;
    }
    public boolean didBumpHead()
    {
            boolean bumpedHead = false;
            int imageWidth = getImage().getWidth();
            int imageHeight = getImage().getHeight();
            if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null || getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null)
            bumpedHead = true;
            return bumpedHead;
    }
    private void detectPortal()
    {
     if(isTouching(portal.class)){
         Greenfoot.setWorld(new Finish()); 
         while(number<10)
         {
            Counter.addScore();
            number++;
         }
         velocity = -10;
        }
     if(isTouching(crab.class))
     {
         Greenfoot.setWorld(new Minigame());
          velocity = -10;
     }
    }
    public void hitHunter()
    {
        Actor hunters = getOneIntersectingObject(enemy.class);
        if( hunters != null)
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            Greenfoot.setWorld(new GameOver()); 
            myWorld.removeObject(this);return;
        }
        Actor raindeer;
        raindeer= getOneObjectAtOffset(0, 0, mainpoints.class);
        if((raindeer!=null) & (getWorld() instanceof level5_1))
        {
            level5_1 Level1 = (level5_1)getWorld();
            Level1.removeObject(raindeer);
            
        }
        if((raindeer!=null) & (getWorld() instanceof level5_2))
        {
            level5_2 Level2 = (level5_2)getWorld();
            Level2.removeObject(raindeer);
            
        }  
    }
}

