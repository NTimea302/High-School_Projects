import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class cloud extends asd
{
    private int speed = 2;
    private int leftTurn = 450;
    private int rightTurn = 750;
    public cloud()
    {
        
    }
    public void act()
    {
        setLocation( getX()+speed, getY());
        if(atTurningPoint()){
            speed = -speed;
        }
    }
    public boolean atTurningPoint ()
    {
        return (getX() <= leftTurn || getX() >= rightTurn);
    }
}