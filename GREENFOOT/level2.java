import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level2 extends World
{
    Counter counter2 = new Counter();
    public Counter getCounter()
    {
        return counter2;
    }

    public level2()
    {    
        super(1200, 800, 1); 
        Platform Platform1 = new Platform();
        addObject (Platform1, 600,775);
        wolf wolf1 = new wolf();
        addObject (wolf1, 1150,705);
        wolf_1 wolf_12 = new wolf_1();
        addObject (wolf_12, 36,747);
        hunter hunter_1 = new hunter();
        addObject (hunter_1, 382,650);
        cloud cloud_1 = new cloud();
        addObject (cloud_1, 451,106);
        plat1 plat11 = new plat1();
        addObject (plat11, 215,650);
        plat1 plat12 = new plat1();
        addObject (plat12, 318,525);
        plat1 plat13 = new plat1();
        addObject (plat13, 473,413);
        plat1 plat14 = new plat1();
        addObject (plat14, 417,267);
        plat1 plat15 = new plat1();
        addObject (plat15, 584,194);
        plat1 plat16 = new plat1();
        addObject (plat16, 625,323);
        plat1 plat17 = new plat1();
        addObject (plat17, 602,544);
        plat1 plat18 = new plat1();
        addObject (plat18, 751,590);
        plat1 plat19 = new plat1();
        addObject (plat19, 894,637);
        plat1 plat20 = new plat1();
        addObject (plat20, 1031,687);
        rabbit rabbit1 = new rabbit();
        addObject (rabbit1, 589, 148);
        addObject(counter2,100,40);
        Timeer timer1 = new Timeer();
        addObject(timer1,107,12);
    }
}