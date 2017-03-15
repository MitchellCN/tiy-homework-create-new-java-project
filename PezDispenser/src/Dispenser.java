/**
 * Created by cmitchell on 3/11/17.
 */
public class Dispenser {
    public static final int MAX_PEZ_COUNT = 12;
    private String dispenserType;

    private int pezCount;

    public Dispenser() {}

    public Dispenser(String dispenserType) {
        this.dispenserType = dispenserType;
        pezCount = 0;

    }

    public String getDispenserType(){
        return dispenserType;
    }


    public int getPezCount() {
        return pezCount;
    }
//method that load dispenser

    public void load(){
        load(MAX_PEZ_COUNT);


            }
    public void load(int pezAmount) {
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ_COUNT) {
            System.out.println("Sorry, that's to many PEZ!!!");

        } else {
            System.out.println("Loading dispenser...");
            pezCount = newAmount;
        }
    }
        public void removePez(){
            pezCount -= 1;
            System.out.println("Chomp!");
    }


        public boolean isEmpty() {

            if (pezCount <= 0) {
                System.out.printf("Sorry, your %s dispenser is Empty! %n",getDispenserType());
                return true;

            } else {
                System.out.printf("You have %s Pez left! %n %n", getPezCount());
                return false;
            }
        }


    public void eat() {
        while (!isEmpty()) {
            removePez();
        }

    }
}