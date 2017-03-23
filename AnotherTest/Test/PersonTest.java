import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

// Tests Person objects
public class PersonTest {

    @Test
    /**
     * Given a Person,
     * When a high five is received,
     * Then the number of high fives the Person has received increases
     */
    public void whenHighFiveReceivedThenHighFiveCountIncreases() throws Exception{
        // Arrange
        Person person = new Person("Doug", 38, 6);

        // Act
        person.receiveHighFive();

        // Assert
        assertThat(person.getHighFivesReceived(), equalTo(1));
    }
}
