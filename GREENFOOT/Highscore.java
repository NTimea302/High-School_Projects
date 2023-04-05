import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Highscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Highscore extends Actor
{
    public static int highscore;
    public void act() 
    {
       drawText();
       setHighscore();
    }  
    private void drawText()
    {
        setImage(new GreenfootImage("Highscore : " + highscore , 24, Color.BLACK, Color.WHITE));
    }
    public void setHighscore()
    {
        if (Counter.score > highscore)
        {
            highscore = Counter.score;
        }
    }
}