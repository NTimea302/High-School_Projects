import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bear extends Actor
{
    private int GRAVITY = 1;
    private int velocity;
    boolean touchingHunter = false;
    int number = 0;
    public bear()
    {
        velocity = 0; 
    }
    public void act()
    {
        fall();
        if(Greenfoot.isKeyDown("space") && isOnSolidGround())
            jump();
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
              setImage(new GreenfootImage("maci2.png"));
          }
          if(Greenfoot.isKeyDown("right")) 
          {
              x = x+3;
              setImage(new GreenfootImage("maci1.png"));
          }
          
          if(isTouching(trampoline.class))
                bjump();
                
          if (isTouching(slippingblock.class))
            x=x+10;
          setLocation(x, y);
        }
    public boolean isOnSolidGround () ///checks whether the actor is or is not on the ground
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
    public boolean didBumpHead() ///
    {
            boolean bumpedHead = false;
            int imageWidth = getImage().getWidth();
            int imageHeight = getImage().getHeight();
            if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null || getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null)
            bumpedHead = true;
            return bumpedHead;
    }
    private void detectPortal() ///checks whether the actor touches a portal
    {
        if(isTouching(portal.class))
        {
            Greenfoot.setWorld(new level5_1()); 
            while(number<10)      ///this adds 10 points to the score
            {
                Counter.addScore();
                number++;
            }
            velocity = -10;
        }
    } 
    private void bjump() ///this is another kind of jump
    {
        velocity = -25;
    }
    public void hitHunter()
    {
        Actor hunters = getOneIntersectingObject(enemy.class); ///if the actor meets with an enemy
        if( hunters != null)
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();  ///a new GameOver screen appears
            Greenfoot.setWorld(new GameOver()); 
            myWorld.removeObject(this);
        }
        Actor bear;
        bear= getOneObjectAtOffset(0, 0, mainpoints.class); ///if the actor meets with a bonus
        if(bear!=null)
        {
            level4 level = (level4)getWorld();
            level.removeObject(bear); ///the bonus is removed
        } 
    }
}

