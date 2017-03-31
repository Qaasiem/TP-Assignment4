/**
 * Created by qaasiem on 2017-03-30.
 */
public class Audi implements Transport
{
    private String make;
    private int model;
    public Car getCar()
    {
        Car c = new Car(make, model);
        return c;
    }
}
