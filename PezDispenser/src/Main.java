import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by cmitchell on 3/11/17.
 */
public class Main {
    public static void main(String[] arg) {
        String input;
        Scanner read = new Scanner(System.in);
        System.out.println("What type of PEZ dispenser would you like?");
        input = read.nextLine();
        while(input.isEmpty()){
            System.out.println("What type of PEZ dispenser would you like?");
            input = read.nextLine();
        }
        Dispenser dispenser = new Dispenser(input);
        System.out.printf("You just got a %s Dispenser..%n", dispenser.getDispenserType());
        dispenser.isEmpty();
        while (true) {


        System.out.printf("Would you like to fill your %s dispenser with PEZ? y/n %n", dispenser.getDispenserType());
        input = read.next();

        if(input.toLowerCase().equals("y")|| input.toLowerCase().equals("yes")){
            dispenser.load();
            break;


        }

        }
        while (true){
            if(!dispenser.isEmpty()){


            System.out.printf("Pick what you would like to do: " +
                    "%n \t\t1. Eat 1 PEZ" +
                    "%n \t\t2. Eat Number of Pez" +
            "%n \t\t3. Eat all you fucking PEZ" +
                    "%n \t\t4. Exit");
            input = read.next();
            if(input.toLowerCase().equals("1")) {
                dispenser.removePez();


            }else if(input.toLowerCase().equals("2")) {

            }else if(input.toLowerCase().equals("3")) {
                dispenser.eat();

            }else if(input.toLowerCase().equals("exit")||input.toLowerCase().equals("4")) {
                break;


            }else {
                System.out.println("Sorry Invalid Option...%nTry again...");
            }
            }
        }



    }







}
