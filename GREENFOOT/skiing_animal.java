import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class skiing_animal extends Actor
{
    private int speed = 2;
    private int speed1 = 1;
    private int leftTurn = 910;
    private int rightTurn = 1100;
    public void act() 
    {
        setLocation( getX()-speed, getY()+speed1);
        if(atTurningPoint())
        {
            speed = -speed;
            speed1= -speed1;
            getImage().mirrorHorizontally();
        }
    }
    public boolean atTurningPoint ()
    {
        return (getX() <= leftTurn || getX() >= rightTurn);
    } 
}
