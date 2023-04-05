import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class snow extends asd
{
    public snow ()
    {
        this (100,25);
    }
    public snow (int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }  
}
