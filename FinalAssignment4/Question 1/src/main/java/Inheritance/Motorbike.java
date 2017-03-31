package Inheritance;

import Encapsulation.Car;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Motorbike extends Car
{
    private String colour;

    public Motorbike()
    {
    }
    public Motorbike(String make,int model,String colour)
    {
        super(make, model);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() + " Colour: " + getColour() + " Model : " + getModel();
    }
}

