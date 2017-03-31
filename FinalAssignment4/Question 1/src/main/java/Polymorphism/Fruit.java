package Polymorphism;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Fruit
{
    private String season;
    private String shape;

    public Fruit (String season, String shape) {
        this.season = season;
        this.shape = shape;
    }

    @Override
    public String toString() {
            return "This fruit is most likely to be found in the " + season + " season and is " + shape + " shape";
    }
}
