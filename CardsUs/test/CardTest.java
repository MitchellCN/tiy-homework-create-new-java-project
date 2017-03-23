import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by cmitchell on 3/22/17.
 */
public class CardTest {


    /**
     * Given a card 3 of Clubs
     * When we get its color
     * Then it is black
     */

    @Test
    public void threeOfClubs()throws Exception{

        //Arrange
        Card card = new Card(Rank.THREE, Suit.CLUBS);

        //Act

        String cardColor = card.suit.getCardColor();


        //Assert

        assertThat("black", equalTo(cardColor));
    }

    /**
     * Given a 4 of Hearts
     * When we get its color
     * Then it is Red
     *
     *
     */


    @Test
    public void fourOfHearts()throws Exception{

        //Arrange
        Card card = new Card(Rank.FOUR, Suit.HEARTS);


        //Act
        String cardColor = card.suit.getCardColor();

        //Assert
        assertThat("red", equalTo(cardColor));
    }

    /**
     * Given an Ace of Spades
     * When we get its color
     * Then it is Black
     *

     */


    @Test
    public void aceOfSpades()throws Exception{

        //Arrange
        Card card = new Card(Rank.ACE, Suit.SPADES);

        //Act
        String cardColor = card.suit.getCardColor();

        //Assert
        assertThat("black", equalTo(cardColor));

    }

    /**
     * Given a Queen of Diamond
     * When we gets its color
     * Then it is Red
     */


    @Test

    public void queenOfDiamond()throws Exception{

        //Arrange
        Card diamond = new Card(Rank.QUEEN, Suit.DIAMONDS);

        //Act
        String cardColor = diamond.suit.getCardColor();

        //Assert
        assertThat("red",   equalTo(cardColor));
    }


    /**
     * Given a Jack and Queen of Diamonds
     * When we gets it color
     * Then it is Red
     *
     *
     */

    @Test

    public void jackAndQueenOfDiamonds()throws Exception{

        //Arrange
        Card jackqueen = new Card(Rank.JACK, Suit.DIAMONDS);
        Card queen = new Card(Rank.QUEEN, Suit.DIAMONDS);
        //Act
        String cardColor = jackqueen.suit.getCardColor();

        //Assert
        assertThat("red", equalTo(cardColor));
    }

    @Test

    /**
     * Given two cards ACE and Jack
     * When
     * Then which card is greater
     */
    public void aceISGreaterThanJack()throws Exception{

        //Arrange
        Card ace = new Card(Rank.Ace);

        //Act


        //Assert
    }
}






