import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level1 extends World
{
   Counter counter = new Counter();
   public Counter getCounter()
   {
       return counter;
   }
    
   public level1()
    {    
        
          super(1200, 800, 1); 
          Counter.setScoreToNull();
          Platform Platform1 = new Platform();
          addObject (Platform1, 600,775);
          fox fox1 = new fox();
          addObject (fox1, 55,715);
          plat1 platform = new plat1();
          addObject(platform, 331,660);
          plat1 platform1 = new plat1();
          addObject(platform1, 548,600);
          plat1 platform2 = new plat1();
          addObject(platform2, 745,610);
          plat1 platform3 = new plat1();
          addObject(platform3, 925,584);
          plat1 platform4 = new plat1();
          addObject(platform4, 1102,501);
          plat1 platform5 = new plat1();
          addObject(platform5, 950,382);
          plat1 platform6 = new plat1();
          addObject(platform6, 762,405);
          plat1 platform7 = new plat1();
          addObject(platform7, 610,350);
          plat1 platform8 = new plat1();
          addObject(platform8, 518,232);
          plat1 platform9 = new plat1();
          addObject(platform9, 768,178);
          plat1 platform10 = new plat1();
          addObject(platform10, 965,123);
          plat1 platform11 = new plat1();
          addObject(platform11, 1127,154);
          fox_1 l_fox = new fox_1 ();
          addObject(l_fox, 1120,120);
          chicken chicken1 = new chicken();
          addObject (chicken1, 1142,692);
          addObject(counter,100,40);
          Timeer timer1 = new Timeer();
          addObject(timer1,107,12);
    }
}