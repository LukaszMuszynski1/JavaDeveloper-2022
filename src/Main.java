import Creatures.Animal;
import Creatures.Human;
import Devices.Car;

public class Main {
    public static void main(String[] args) {

        //Zadanie nr 1 v

        Human me = new Human();
        me.firstName = "Łukasz";

        me.pet = new Animal("canis");
        me.pet.checkIfItIsAlive();
        System.out.println("Waga mojego zwierza to: " + me.pet.getWeight());

        me.pet.feed(1);
        System.out.println("Waga mojego zwierza to: " + me.pet.getWeight());

        me.pet.takeForAWalk(1000);
        System.out.println("Waga mojego zwierza to: " + me.pet.getWeight());
        me.pet.checkIfItIsAlive();

        //Zadanie nr 2 v

        me.auto = new Car(1, "Audi", "A4", "Benzyna", 120000.0);
        me.auto.milage = 245122.6;

        //Zadanie nr 3 v

        System.out.print("\n");

        me.setSalary(2500.0);
        System.out.println(me.getSalary());

        //Zadanie nr 4 v

        System.out.print("\n");

        me.setZus(2500);
        System.out.println(me.getZus());
        me.setZus(2500);
        System.out.println(me.getZus());

        //Zadanie nr 5

       // System.out.println(me.getCar());

    }
}
