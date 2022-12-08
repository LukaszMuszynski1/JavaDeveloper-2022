package Devices;

public class Car extends Device {

    public double milage;
    double engineVolume;
    String fuelType;
    public double value;

    public Car(Integer id, String producer, String model, String fuelType, double value) {
        super(id, producer, model);
        this.fuelType = fuelType;
        this.value = value;
    }
}/
