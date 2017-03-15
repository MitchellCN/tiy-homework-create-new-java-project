/**
 * Created by cmitchell on 3/10/17.
 */
public class Mitch {

   String name;
   String type;
   double health;
   double power;

   public Mitch(String name, String type, double health, double power){

   this.name=name;
   this.type=type;
   this.health=health;
   this.power=power;

   public void attack(Mitch mitch) {

       mitch.health = mitch.health - this.power;




    }
    public String toString() {
       return "The " + this.type + " " + this.name + " has" + " " + this.health + " " + "health" + " " + "and deals " + this.power +
    }




   }
}
