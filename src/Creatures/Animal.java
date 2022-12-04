package Creatures;

public class Animal {
    public static final double DEFAULT_DOG_WEIGHT = 6.0;
    public static final double DEFAULT_CAT_WEIGHT = 4.0;
    public static final double DEFAULT_HORSE_WEIGHT = 800.0;
    public static final double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public final String species;
    public String name;
    private double weight;
    private boolean isAlive;

    public double getWeight() {
        return this.weight;
    }


    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, double weight) {
        this.isAlive = true;
        this.species = species;
        if (weight <= 0) {
            System.out.println("Błąd, dodano wage domyslną");
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        } else {
            this.weight = weight;
        }
    }

    public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne że żyje!");
        } else {
            System.out.println("No niestety, troche za pozno");
        }
    }

    public void feed(double foodWeight) {
        if (isAlive) {
            weight += (foodWeight * 0.3);
            System.out.println("Dzięki za żarcie");
        } else {
            System.out.println("Troche za pozno");
        }
    }

    public void takeForAWalk(double distance) {
        if (!isAlive) {
            System.out.println("Hallo Policja!");
        } else {
            weight -= distance * 0.1;
        }
    }


}
