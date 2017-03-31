package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Audi implements Brand, Colour, Model, Transmission
{
    public void colour() {
        System.out.println("Grey");
    }

    public void transmission() {
        System.out.println("Automatic");
    }

    public void model() {
        System.out.println("2012");
    }

    public void brand() {
        System.out.println("Audi1");
    }
}
