import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class level4 extends World
{
    Counter counter = new Counter();
    public Counter getCounter()
    {
       return counter;
    }
    public level4()
    {    
          super(1200, 800, 1); 
          Platform Platform1 = new Platform();
          addObject (Platform1, 600,775);
          bear bear1 = new bear();
          addObject (bear1, 1140, 705);
          bear_1 bear_11 = new bear_1();
          addObject (bear_11,69,140);
          trampoline trampoline1 = new trampoline();
          addObject (trampoline1,74,754);
          slippingblock slippingblock1 = new slippingblock();
          addObject (slippingblock1,476,281);
          trampoline trampoline2 = new trampoline();
          addObject (trampoline2,1152,422);
          slippingblock slippingblock2 = new slippingblock();
          addObject (slippingblock2,886,486);
          ice2 ice2_1 = new ice2();
          addObject (ice2_1, 650,586);
          ice2 ice2_2 = new ice2();
          addObject (ice2_2,293,408);
          ice2 ice2_3 = new ice2();
          addObject (ice2_3,861,195);
          ice2 ice2_4 = new ice2();
          addObject (ice2_4,634,185);
          ice2 ice2_5 = new ice2();
          addObject (ice2_5,366,170);
          ice2 ice2_6 = new ice2();
          addObject (ice2_6,79,175);
          ice2 ice2_7 = new ice2();
          addObject (ice2_7,1148,461);
          raspberry raspberry1 = new raspberry();
          addObject(raspberry1, 637, 373);
          addObject(counter,100,40);
          Timeer timer1 = new Timeer();
          addObject(timer1,107,12);
    }
}