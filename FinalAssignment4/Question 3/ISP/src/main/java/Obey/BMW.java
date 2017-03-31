package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class BMW implements Brand, Colour, Model, Transmission
{
    public void colour() {
        System.out.println("Red");
    }

    public void transmission() {
        System.out.println("Manual");
    }

    public void model() {
        System.out.println("2001");
    }

    public void brand() {
        System.out.println("BMW1");
    }
}
