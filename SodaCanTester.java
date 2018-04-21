
/**
 * class SodaCanTester
 * This program tests the SodaCan
 * 
 * Ruby-Anne Locke, April 02, 2016, rubylocke@hotmail.com
 */
public class SodaCanTester
{
    /** Tests the methods of the SodaCan class
    * @parmam args not used
    */
    public static void main(String[] args)
    {
       System.out.println("     Volume                   Size ");
       // SodaCan sodaCan1 = new SodaCan(5,3);    // new object
       // System.out.println("  "  + sodaCan1.getVolume() + "  "   + sodaCan1.getSurfaceArea());
       
       // SodaCan sodaCan2 = new SodaCan(3,2);    // new object
       // System.out.println("  "  + sodaCan2.getVolume() + "  "   + sodaCan2.getSurfaceArea());
       
       SodaCan sodaCan3 = new SodaCan(4.25,1);    // new object
       System.out.println("  "  + sodaCan3.getVolume() + "  "   + sodaCan3.getSurfaceArea());
    }
}
