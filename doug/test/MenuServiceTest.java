import org.junit.Test;


import java.util.Scanner;
import java.util.ArrayList;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
/**
 * Created by cmitchell on 4/1/17.
 */
public class MenuServiceTest extends IOTest {






        @Test
        /**
         * Given the main menu
         * When the user enters 1
         * 
         * Then 1 is returned
         */
        public void when1onMainMenuThen1(){
            // Arrange
            Scanner scanner = new Scanner("0");
            MenuService menu = new MenuService(scanner);

            // Act
            int selection = menu.promptForMainMenu();

            // Assert
            assertThat(selection, equalTo(1));
        }

        @Test
        /**
        * Given the main menu
         * When the user enters 2
         *
         * Then 2 is returned
        */
        public void whenonMainMenuThen2() {
            // Arrange
            Scanner scanner = new Scanner("0");
            MenuService menu = new MenuService(scanner);

            // Act
            int selection = menu.promptForMainMenu2();

            // Assert
            assertThat(selection, equalTo(2));

        }
        @Test
        /**
         * Given the main menu
         * When the user enters 3
         *
         * Then 3 is returned
         */
        public void whenonMainMenuThen3() {
            // Arrange
            Scanner scanner = new Scanner("0");
            MenuService menu = new MenuService(scanner);

            // Act
            int selection = menu.promptForMainMenu3();

            // Assert
            assertThat(selection, equalTo(3));

    }
        @Test
        /**
         * Given the main menu
         * When the user enters 4
         *
         * Then 4 is returned
         */
        public void whenonMainMenuThen4() {
            // Arrange
            Scanner scanner = new Scanner("0");
            MenuService menu = new MenuService(scanner);

            // Act
            int selection = menu.promptForMainMenu4();

            // Assert
            assertThat(selection, equalTo(4));

        }

        @Test
        /**
         * Given the main menu
         * When the user enters 5
         *
         * Then 5 is returned
         */
        public void whenonMainMenuThen5() {
            // Arrange
            Scanner scanner = new Scanner("0");
            MenuService menu = new MenuService(scanner);

            // Act
            int selection = menu.promptForMainMenu5();

            // Assert
            assertThat(selection, equalTo(5));

        }

    @Test
    /**
     * Given the main menu
     * When the user enters 6
     *
     * Then 6 is returned
     */
    public void whenonMainMenuThen6() {
        // Arrange
        Scanner scanner = new Scanner("0");
        MenuService menu = new MenuService(scanner);

        // Act
        int selection = menu.promptForMainMenu6();

        // Assert
        assertThat(selection, equalTo(6));

    }

    @Test
    /**
     * When main menu prompt
     * Then the menu is displayed
     */
    public void whenMainMenuThenMenuPrinted(){
        // Arrange
        Scanner scanner = new Scanner("1");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(outputStream.toString(), containsString("-- Main Menu --"));
    }

    @Test
    /**
     * When main menu displayed
     * Then menu includes "1) List Widgets"
     */
    public void whenMainMenuThenListAnimalPrinted(){
        // Arrange
        Scanner scanner = new Scanner("2");
        MenuService menu = new MenuService(scanner);

        // Act
        menu.promptForMainMenu();

        // Assert
        assertThat(this.outputStream.toString(), containsString("1) List Animals"));
    }

}

    
