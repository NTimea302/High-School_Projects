import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {   
        super(1200, 800, 1); 
        Storry story1 = new Storry();
        addObject(story1,603,727);
        Instruction ins = new Instruction();
        addObject(ins,788,548);
        Play play = new Play();
        addObject(play,600,553);
        Tips tricks = new Tips();
        addObject(tricks,407,543);
        SoundOn sound = new SoundOn();
        addObject(sound,1120,74);
    }
}
