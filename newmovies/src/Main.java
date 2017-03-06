/**
 * Created by cmitchell on 3/6/17.
 */
public class Main {

    public static void main (String [] arg){

        Movie movie1 = new Movie ();

        movie1.name = "Eddie and The Cruisers";
        movie1.genre = "drama";
        movie1.runTime = 127.5;
        movie1.didItMakeMeCry = true;


        Movie movie2 = new Movie ();

        movie2.name = "Hollywood Knights";
        movie2.genre = "comedy";
        movie2.runTime = 115.5;
        movie2.didItMakeMeCry = false;

        System.out.println("The movie " + movie1.name + " is a " + movie1.genre + " that is " + movie1.runTime + " minutes long ." + " Did it make me cry? " + movie1.didItMakeMeCry +"." );
    }
}


