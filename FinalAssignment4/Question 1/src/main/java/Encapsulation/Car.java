package Encapsulation;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Car
{
    private String make;
    private int model;

    public Car()
    {

    }

    public Car(String make, int model)
    {
        this.make = make;
        this.model = model;

    }

    public int getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }


    public void setModel(int model1) {
        model = model1;
    }

    public void setMake(String make1) {
        make = make1;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() + " Model: " + getModel();
    }
}

