/**
 * on the main source screen just put the public class Main {
 *  *     and the public static void main(String[] args) {
 *  *         create a variable that can hold a card and assign it to a new instance
 *  *     }
 *
 *
 *
 *
 * Created by cmitchell on 3/3/17.
 */
public class Main {
    public static void main(String[] args){
        Cards card = new Cards();

        card.suit = "Clubs";
        card.value = "Jack";
        card.faceUp = true;

        Cards card2 = new Cards();

        card.suit = "Spades";
        card.value = "Ace";
        card.faceUp = false;

        Cards card3 = card;
        card.faceUp = false;

        System.out.println(card.suit + " " + card.value + " " + card.faceUp);
    }
}

