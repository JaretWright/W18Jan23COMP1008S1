package w18jan23comp1008;

/**
 *
 * @author JWright
 */
public class Card {
    private String faceName, suit;
    private int faceValue; //aces will be high
    
    /**
     * Here is our constructor.  Note no return type
     */
    public Card(String faceName, String suit, int value)
    {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(value);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String newSuit) {
        if (newSuit.equalsIgnoreCase("hearts") || newSuit.equalsIgnoreCase("diamonds")
                || newSuit.equalsIgnoreCase("clubs") || newSuit.equalsIgnoreCase("spades")){
            this.suit = newSuit;    
        }
        else
            throw new IllegalArgumentException("Suit must be hearts, diamonds, clubs or spades");
        
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    
    
}
