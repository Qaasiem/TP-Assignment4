import java.io.Serializable;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Car implements Serializable
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

    public String find()
    {
        String res;
        if(getModel()>2001&getModel()<2017)
        {
            res ="qualifies for insurance";
        }
        else
        {
            res ="Does not qualify";
        }

        return res;
    }
}
