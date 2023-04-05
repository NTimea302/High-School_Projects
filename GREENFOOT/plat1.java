import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class plat1 extends asd
{
    public plat1 ()
    {
        this (100,25);
    }
    public plat1 (int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    } 
}
