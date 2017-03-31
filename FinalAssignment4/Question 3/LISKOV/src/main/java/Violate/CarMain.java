package Violate;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class CarMain {
    Vehicle t;

    public int getBusSize() {
        Bus c = new Bus();
        return c.getSize();
    }

    public int getCarWidth() {
        t = new Car();
        return t.getWidth();

    }
}