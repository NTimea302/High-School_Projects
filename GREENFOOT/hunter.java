import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hunter extends enemy
{
    private int speed = 4;
    private int leftTurn = 300;
    private int rightTurn = 900;
    public void act() 
    {
        setLocation( getX()+speed, getY());
        if(atTurningPoint())
        {
            speed = -speed;
            getImage().mirrorHorizontally();
        }
    }
    public boolean atTurningPoint ()
    {
        return (getX() <= leftTurn || getX() >= rightTurn);
    }
}    

