import Creatures.Animal;
import Creatures.Human;
import Devices.Car;

public class Main {
    public static void main(String[] args) {

        Human me = new Human();
        me.pet = new Animal("felis");
        me.firstName = "Ala";
        System.out.println(me.firstName + " ma zwierzę " + me.pet.species);

        Animal dog = new Animal("canis");
        me.pet = dog;
        System.out.println(me.firstName + " ma zwierzę " + me.pet.species);

        me.pet.feed(1.0);

        Car fiat = new Car(1, "Fiat", "Bravo", "Diesel");
        fiat.milage = 332313.0;

    }
}
