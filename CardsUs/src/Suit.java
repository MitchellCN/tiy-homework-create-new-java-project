/**
 * Created by cmitchell on 3/22/17.
 */
public enum Suit {
    HEARTS("red"),
    DIAMONDS("red"),
    SPADES("black"),
    CLUBS("black");
    String color;

    Suit(String color){
        this.color = color;
    }

    public String getCardColor() {
        return color;
    }
}
