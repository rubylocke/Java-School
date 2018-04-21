/**
*  class Moth 
*
* Ruby-Anne Locke, April 08, 2016, rubylocke@hotmail.com
*/
public class Moth
{
   // instance variables 
   private double position;  // current position

   /**
   * Constructor for objects for class Moth
   */   
    public Moth(double initialposition)
   {
       position = initialposition;
   }

   public void moveToLight(double lightPosition)
   {
       position = (lightPosition - position) / 2 + position;
   }
   public double getPosition()
   {
         double theposition = position;
         return theposition;
   }
}
 
