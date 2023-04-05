import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

public class Counter extends Actor
{
    public static int score = 0;
   
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score , 24, Color.BLACK, Color.WHITE));
    }
    
    public static void addScore()
    {
        score++;
    }
    
    public static void setScoreToNull()
    {
        score=0;
    }
}
