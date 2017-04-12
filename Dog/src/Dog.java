/**
 * Created by cmitchell on 3/25/17.
 */
public class Dog {
    String name;
    public static void main (String[] args){
        Dog dog1 = new Dog();
        //dog1.bark();
        dog1.name = "Daisy";

        Dog[] myDogs = new Dog[5];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();
        myDogs[3] = new Dog();
        myDogs[4] = new Dog();

        myDogs[0].name = "Oliver";
        myDogs[1].name = "Bobo";
        myDogs[2].name = "Bronson";
        myDogs[3].name = "Bebop";
        myDogs[4].name = "Nicks";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[4].name);

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x=x+1;

        }

    }

    public void bark(){

        System.out.println(name + " says Ruff!");
    }
}
