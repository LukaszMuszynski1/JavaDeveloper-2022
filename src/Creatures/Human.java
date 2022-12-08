package Creatures;

import Devices.Car;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public Animal pet;
    private Car auto;
    public double salary;
    public double przychod;

    public Human() {
        super("Homo Sapiens", 70.0);
    }

    public double getSalary() {
        System.out.println("\nDane bankowe: \n");
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date = data.format(new Date());
        System.out.print("Data pobrania: ");
        System.out.println(date);
        System.out.print("Saldo konta: ");
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setZus(double przychod) {
        this.przychod = przychod;
    }

    public double getZus() {
        if (przychod >= 0) {

            System.out.println("\nNowe dane zostały wysłane do systemu księgowego." +
                    "\nAneks do umowy do odbioru u H. Kowalskiej z Działu Kadr." +
                    "\nZUS oraz US zostały poinformowane o zmianie wysokości wypłaty." +
                    "\n\nProsimy nie ukrywać przychodu...");

            double saldo = getSalary();

            double dochod = saldo += (przychod * 0.77);
            setSalary(dochod);

        } else {
            System.out.println("Przypisano błędną wartość, spróbuj ponownie");
        }
        return this.salary;
    }
    public Car getCar() {
        return me.auto;
    }

    public void setCar(double salary, double value) {
        this.salary = salary;
        if (salary > value) {
            System.out.println("Udało Ci się kupić ten samochód za gotówkę!");

        } else if ((salary/12) > value) {
            System.out.println("Udalo Ci się kupić auto na kredyt!");

        } else {
            System.out.println("Zmień pracę, weź kredyt!");

        }

    }/
}

