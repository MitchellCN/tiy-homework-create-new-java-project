import java.util.Scanner;

/**
 * Created by cmitchell on 4/1/17.
 */
public class MenuService {

    Scanner scanner;

    public MenuService(Scanner scanner) {
        this.scanner = scanner;
    }
    public int prompt1ForMainMenu(){

        System.out.println(
                "-- Main Menu --\n" +
                        "1) List Animal\n" +
                        "2) Create a Animal\n" +
                        "3) View a Animal\n" +
                        "4) Edit a Animal\n" +
                        "5) Delete a Animal\n" +
                        "6) Quit\n\n" +
                        "Select an option: ");


        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            if(input >= 1 && input <= 6){
                return input;
            } else {
                System.out.println("Error: '" + input + "' is not a valid choice!");

                return promptForMainMenu();
            }

        } else {

            String badInput = scanner.nextLine();

            System.out.println("Error: '" + badInput + "' is not a valid number!");

            return promptForMainMenu();


    public int promptForMainMenu() {
        return 1;
    }

    public int promptForMainMenu2() {
        return 2;
    }

    public int promptForMainMenu3() {
        return 3;
    }

    public int promptForMainMenu4() {
        return 4;
    }

    public int promptForMainMenu5() {
        return 5;
    }

    public int promptForMainMenu6() {
        return 6;
    }

    Scanner scanner;
        public MenuService(Scanner scanner1){
       this.scanner = scanner;


    public int prompt1ForMainMenu(){

        System.out.println(
                "-- Main Menu --\n" +
                        "1) List Animal\n" +
                        "2) Create a Animal\n" +
                        "3) View a Animal\n" +
                        "4) Edit a Animal\n" +
                        "5) Delete a Animal\n" +
                        "6) Quit\n\n" +
                        "Select an option: ");


        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            if(input >= 1 && input <= 6){
                return input;
            } else {
                System.out.println("Error: '" + input + "' is not a valid choice!");

                return promptForMainMenu();
            }

        } else {

            String badInput = scanner.nextLine();

            System.out.println("Error: '" + badInput + "' is not a valid number!");

            return promptForMainMenu();
        }
        }




}
