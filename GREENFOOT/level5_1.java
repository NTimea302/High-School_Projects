import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level5_1 extends World
{

     Counter counter = new Counter();
   public Counter getCounter()
   {
       return counter;
   }
    public level5_1()
    {    
          super(1200, 800, 1); 
          Platform Platform1 = new Platform();
          addObject (Platform1, 600,775);
          raindeer r1 = new raindeer();
          addObject(r1, 50 ,700);
          raindeer_1 raindeer_11 = new raindeer_1();
          addObject (raindeer_11, 962,608);
          crab crab1 = new crab();
          addObject (crab1,424,652);
          boar boar1 = new boar();
          addObject (boar1,722,711);
          bat bat1 = new bat();
          addObject (bat1, 435,313);
          ice ice1 = new ice();
          addObject (ice1,321,579);
          ice ice2 = new ice();
          addObject (ice2,194,669);
          ice ice3 = new ice();
          addObject (ice3,481,516);
          ice ice4 = new ice();
          addObject (ice4,646,448);
          ice ice5 = new ice();
          addObject (ice5,818,496);
          plant plant1 = new plant();
          addObject(plant1, 1147,675);
          addObject(counter,100,40);
          Timeer timer1 = new Timeer();
          addObject(timer1,107,12);
    }
}