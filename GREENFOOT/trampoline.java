import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class trampoline extends asd
{
    public trampoline ()
    {
        this (150, 150);
    }
    public trampoline (int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
}
