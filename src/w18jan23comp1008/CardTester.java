
package w18jan23comp1008;

/**
 *
 * @author JWright
 */
public class CardTester {
    public static void main(String[] args)
    {
        //wahoo we just created our first object
        Card    aceOfSpades = new Card("Ace","Spades",14);
       
        System.out.printf("Our card's suit is: %s%n", aceOfSpades.getSuit());
        
        Card aceOfDiamonds = new Card("Ace","Diamonds",14);
        System.out.printf("Our diamond card's suit is: %s%n", aceOfDiamonds.getSuit());
        
        Card king = new Card("King","Clubs", 13);
        Card jdub = new Card("JDub","Clubs", 13);
        
    }
}
