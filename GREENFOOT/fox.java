import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fox extends Actor
{
    private GreenfootImage myImage = getImage();
    private final int GRAVITY = 1;
    private int velocity;
    boolean touchingHunter = false;
    int number = 0;
    public fox()
    {velocity = 0; 
    }
    public void act()
    {
        fall();
        if(Greenfoot.isKeyDown("space") && isOnSolidGround())
            jump();
        move();
        detectPortal();
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
              setImage(new GreenfootImage("fox-8.1.png"));
          }
          if(Greenfoot.isKeyDown("right")) 
          {
              x = x+3;
              setImage(new GreenfootImage("fox-8.png"));
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
        if(isTouching(portal.class))
        {
            Greenfoot.setWorld(new level2()); 
            while(number<10)
            {
                Counter.addScore();
                number++;
            }
            velocity = -10;
        } 
        Actor chicken;
        chicken = getOneObjectAtOffset(0, 0, mainpoints.class);
        if(chicken !=null)
        {
            level1 level = (level1)getWorld();
            level.removeObject(chicken);
        }
        
        Actor fox_1;
        fox_1 = getOneObjectAtOffset(0, 0, portal.class);
        if(fox_1 !=null)
        {
            level1 level = (level1)getWorld();
            level.removeObject(fox_1);
        } 
    }
}