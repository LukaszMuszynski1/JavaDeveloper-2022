package Devices;

public class Phone extends Device {

    final double screenSize;
    boolean isAndroid;

    public Phone(Integer id, String producer, String model, double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }


}
