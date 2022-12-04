package Devices;

public class Car extends Device {

    public double milage;
    double engineVolume;
    String fuelType;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }
}
