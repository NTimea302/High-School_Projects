import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bat extends enemy
{
    private int speed = 3;
    private int leftTurn = 200;
    private int rightTurn = 1000;
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