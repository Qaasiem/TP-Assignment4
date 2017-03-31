package Violate;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class Bus implements Vehicle
{
    public int getArea() {
        return 150;
    }

    @Override
    public int getLength() {
        return 110;
    }

    @Override
    public int getWidth() {
        return 40;
    }

    public int getSize()
    {
        return 150;
    }
}
