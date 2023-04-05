import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wolf extends Actor
{
     private final int GRAVITY = 1;
    private int velocity;
    boolean touchingHunter = false;
int number = 0;
    public wolf()
    {velocity = 0; 
    }
      public void act()
    {fall();
        if(Greenfoot.isKeyDown("space") && isOnSolidGround()) jump();
        move();
        detectPortal();
        hitHunter();
    } 
public void fall() {
          setLocation(getX(), getY() + velocity);
          if(isOnSolidGround()){
              velocity = 0;}
          else if(velocity <0 && didBumpHead()) velocity = 0;
          else velocity += GRAVITY;}
      public void jump()
      {velocity = -15;
        }
      public void move()
      {
          int y = getY();
          int x = getX();
          if(Greenfoot.isKeyDown("left")){ x = x-3;
              setImage(new GreenfootImage("wolf.png"));}
          if(Greenfoot.isKeyDown("right")){ x = x+3;
              setImage(new GreenfootImage("wolf1.png"));}
 setLocation(x, y);
        }
        public boolean isOnSolidGround ()
        { boolean isOnGround = false;
            if(getY() > getWorld().getHeight()-50)
            isOnGround = true;
            
            int imageWidth = getImage().getWidth();
            int imageHeight = getImage().getHeight();
            if(getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, asd.class) != null ||
getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, asd.class) != null)
            isOnGround = true;
            
            return isOnGround;
        }
        public boolean didBumpHead(){
            boolean bumpedHead = false;
            
               int imageWidth = getImage().getWidth();
               int imageHeight = getImage().getHeight();
if(getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null ||
            getOneObjectAtOffset(imageWidth / -2, imageHeight / -2, asd.class) != null)
            bumpedHead = true;
            return bumpedHead;
            
}
private void detectPortal()
{
 if(isTouching(portal.class)){
     Greenfoot.setWorld(new level3()); 
      while(number<10)
    {
        Counter.addScore();
        number++;
    }
     velocity = -10;

    
    }
       
}

 public void hitHunter()
    {
        Actor hunter = getOneIntersectingObject(enemy.class);
        if( hunter != null)
        {
            World myWorld = getWorld();
                GameOver gameover = new GameOver();
Greenfoot.setWorld(new GameOver()); 
                 myWorld.removeObject(this);
                 return;
 }

Actor wolf= getOneObjectAtOffset(0, 0, mainpoints.class);
if(wolf!=null)
{
    level2 level = (level2)getWorld();
    level.removeObject(wolf);
} 
}
}


