import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class slippingblock extends asd
{
    public slippingblock ()
    {
        this (100,25);
    }
    public slippingblock (int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
}
