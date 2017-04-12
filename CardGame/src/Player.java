/**
 * Created by cmitchell on 3/25/17.
 */
public class Player {

    //setting the first possible number to guess
    int number = 0;

    public void guess(){

        //this sets the random number the player can guess
        number = (int) (Math.random() * 100);

        //this is printing out what number each player is guessing
        System.out.println("I'm guessing" + number);

    }

}
