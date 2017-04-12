/**
 * Created by cmitchell on 3/25/17.
 */
public class Books {
    String title;
    String author;
}
class BooksTestDrive{
    public static void main(String [] args){

        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        int x = 0;

        myBooks[0].title = "The Force";
        myBooks[1].title = "The Catcher In The Rye";
        myBooks[2].title = "The Catepillar";
        myBooks[0].author = "Ian Fleming";
        myBooks[1].author = "Holden Caufield";
        myBooks[2].author = "Lindsay Buckingham";


        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.println(" by ");
            System.out.println(myBooks[x].author);
            x = x+1;

        }
    }
}