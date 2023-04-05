import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SoundOn extends Buttons
{   GreenfootSound sound = new GreenfootSound("winter.mp3");
    private GreenfootImage tickbox;     
    private GreenfootImage tickboxtick;
    public  SoundOn()
    {
        tickbox = new GreenfootImage("sound.png");
        tickboxtick = new GreenfootImage("nosound.png");
        setImage(tickboxtick);
    }
    public void act() 
    {
        changeImage();
    } 
    public void changeImage()
    {
        if(Greenfoot.mouseClicked(this)) 
        {
            Greenfoot.playSound("onclick.mp3");
            if(getImage()==(tickbox))
            {
                setImage(tickboxtick);
                sound.stop();
            }
            else
            {
                setImage(tickbox);
                sound.play();
            }
        }
    }
}