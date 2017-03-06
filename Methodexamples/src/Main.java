import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by cmitchell on 3/6/17.
 */
public class Main {

    public static void main(String[] args) {
        sayHi();

        int x = getSomeNumber();

      //  getSomeNumber();

        sayBye();

    }

    public static int getSomeNumber() {
        int x = 123;
        x = x + 321;

        return x;
    }

    public static void sayHi() {
        System.out.println("Hi");
    }

    public static void sayBye() {
        System.out.println("Bye");
        System.out.println("Go away now!!");
    }
}

