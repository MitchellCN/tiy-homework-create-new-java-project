/**
 * Created by cmitchell on 4/4/17.
 */
public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1; a <= 12; ++a) {
            for (b = 1; b <= 12; ++b) {
                System.out.printf("%10d", (a * b));
            }
            System.out.println();
        }
    }

}