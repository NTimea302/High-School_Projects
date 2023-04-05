import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level3 extends World
{
    Counter counter = new Counter();
    public Counter getCounter()
    {
       return counter;
    }
    
    public level3()
    {    
          super(1200, 800, 1); 
          Platform Platform1 = new Platform();
          addObject (Platform1, 600,775);
          penguin penguin1 = new penguin();
          addObject (penguin1, 40,700);
          penguin_1 penguin_11 = new penguin_1();
          addObject (penguin_11, 41,185);
          ice ice2 = new ice();
          addObject (ice2, 186,702);
          ice ice3 = new ice();
          addObject (ice3, 296,634);
          ice ice4 = new ice();
          addObject (ice4, 402,576);
          ice ice5 = new ice();
          addObject (ice5, 513,515);
          ice ice6 = new ice();
          addObject (ice6, 630,460);
          ice ice7 = new ice();
          addObject (ice7, 753,519);
          ice ice8 = new ice();
          addObject (ice8, 872,564);
          ice ice9 = new ice();
          addObject (ice9, 994,620);
          ice ice10 = new ice();
          addObject (ice10, 1151,576);
          ice ice11 = new ice();
          addObject (ice11, 1074,501);
          ice ice12 = new ice();
          addObject (ice12, 1180,427);
          ice ice13 = new ice();
          addObject (ice13, 1071,359);
          ice ice14 = new ice();
          addObject (ice14, 937,313);
          ice ice15 = new ice();
          addObject (ice15, 788,278);
          ice ice16 = new ice();
          addObject (ice16, 632,300);
          ice ice18 = new ice();
          addObject (ice18, 473,337);
          ice ice17 = new ice();
          addObject (ice17, 309,370);
          ice ice19 = new ice();
          addObject (ice19, 172,310);
          ice ice20 = new ice();
          addObject (ice20, 48,228);
          bat bat1 = new bat();
          addObject (bat1, 230,378);
          snowman snowman1 = new snowman();
          addObject (snowman1, 439,700);
          fish fish1 = new fish();
          addObject (fish1, 618,526);
          addObject(counter,100,40);
          skiing_animal one = new skiing_animal();
          addObject(one,1070,164);
          Timeer timer1 = new Timeer();
          addObject(timer1,107,12);
    }
}