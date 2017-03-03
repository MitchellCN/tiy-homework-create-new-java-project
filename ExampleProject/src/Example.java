import java.util.Random;

public class Example {

    public static void main(String[] args){

        Random random = new Random();

        // pick two random integers from 1 to 1000
        int firstRandomNumber = random.nextInt(999) + 1;
        int secondRandomNumber = random.nextInt(999) + 1;

        // tell us what the integers are
        System.out.println("The first number is " + firstRandomNumber);
        System.out.println("The second number is " + secondRandomNumber);

        // do some arithmetic
        int sum = firstRandomNumber + secondRandomNumber;
        int difference = firstRandomNumber - secondRandomNumber;
        int product = firstRandomNumber * secondRandomNumber;
        int quotient = firstRandomNumber / secondRandomNumber;
        int remainder = firstRandomNumber % secondRandomNumber;

        // tell us the results of the arithmetic
        System.out.println("firstRandomNumber + secondRandomNumber = " + sum);
        System.out.println("firstRandomNumber - secondRandomNumber = " + difference);
        System.out.println("firstRandomNumber * secondRandomNumber = " + product);
        System.out.println("firstRandomNumber / secondRandomNumber = " + quotient);
        System.out.println("firstRandomNumber % secondRandomNumber = " + remainder);

    }
}
