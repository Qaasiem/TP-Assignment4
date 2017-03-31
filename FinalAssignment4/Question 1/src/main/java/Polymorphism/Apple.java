package Polymorphism;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Apple extends Fruit
{
    private int size;
    private int weight;

    public Apple(String season, String shape, int size, int weight)
    {
        super(season, shape);
        this.size = size;
        this.weight = weight;
    }
}
