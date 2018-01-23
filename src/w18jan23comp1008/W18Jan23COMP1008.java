
package w18jan23comp1008;

/**
 *
 * @author JWright
 */
public class W18Jan23COMP1008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //challenge 1
       for (int counter=100; counter >=1; counter -= 5)
           System.out.println(counter);
       
       //challenge 2 & 3 
       for (int counter=0; counter <= 100; counter += 10)
           System.out.printf("%d%s%n", counter, counter%20==0?" Java":"");
       
       System.out.printf("For snow depth 20, can we ski? %b%n", timeToSki(20));
       System.out.printf("For snow depth 40, can we ski? %b%n", timeToSki(40));
    }
    
    //challenge 4 - time to ski method
    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }
}
