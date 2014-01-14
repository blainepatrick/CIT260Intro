/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gallons2liters2;

/**
 *
 * @author PATRICKS
 */
public class Gallons2Liters2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // variable declaration
        double galz, leetuhz;
        int blankLineCountuh = 0;
        
        // create and loop through a collection of individual gallons
        for (galz = 1; galz <= 100; galz++)
        {
            // convert to liters
            leetuhz = galz * 3.7854;
            
            // print results to the screen
            System.out.println(galz + " gallons is " + 
                    leetuhz + " liters.");
            
            // increment the line counter with each loop iteration
            blankLineCountuh++;
            
            // every tenth line, print a blank line
            if (blankLineCountuh == 10)
            {
                System.out.println();
                //reset the line counter
                blankLineCountuh = 0;
            }
        }
    }
}
