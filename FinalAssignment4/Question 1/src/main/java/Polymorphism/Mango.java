package Polymorphism;

import Polymorphism.Fruit;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Mango extends Fruit
{
    private int size;
    private int weight;

    public Mango(String season, String shape, int size, int weight)
    {
        super(season, shape);
        this.size = size;
        this.weight = weight;
    }
}
