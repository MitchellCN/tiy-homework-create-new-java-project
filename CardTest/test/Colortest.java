import com.sun.tools.corba.se.idl.constExpr.Equal;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import static org.hamcrest.MatcherAssert.*;

/**
 * Created by chrisaanerud on 3/21/17.
 */
public class CardTest {

    /**Given a card 3 of Clubs
     *
     * When we get its color
     * Then it is black
     */

    @Test
    public void colorOfCard()throws Exception{

//Arrange

        Card threeOfClubs = new Card(Rank.THREE, "Clubs");

        //Act

        Color color = threeOfClubs.getColor();

        //Assert

        assertThat(color, equalTo(Color.BLACK));

        //assertThat(card.redOrBlackGiven(), equalTo(true));



    }



    @Test

    public void jackIsAClub()throws Exception{

        Card card = new Card(Rank.JACK, "Clubs");
    }


    @Test

    /**
     * Given a three of hearts
     * When we get its color
     * Then it is redf
     */


    public void colorOfHeart()throws Exception {


        //Arrange
        Card threeOfHearts = new Card(Rank.THREE, "Heart");


        //Act
        Color color = threeOfHearts.getColor();


        //Assert
        assertThat(color, equalTo(Color.RED));

    }

}


/**
 * Created by cmitchell on 3/21/17.
 */
public class Colortest {




    @Test


    /**
     * Given a card 3 of clubs
     * When we get its color
     * Then it is black
      */


public void colorofCard() throws Exception{
    //Arrange

        Card threeOfClubs = new Card (Rank.THREE,"Clubs");

        //Act
        Color color = threeOfClubs.getColor();

        assertThat(color, equalTo(Color.RED));
        //Assert

    }




}


