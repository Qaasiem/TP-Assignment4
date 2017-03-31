package Violate;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class OCPMain {

    public int getLength(TotalLength t)
    {
        int length = 0;
        if(t.getShape().equals("circle"))
            length = 1;
        else
            length = 5;
        return length;
    }
    public int getSquare()
    {
        return getLength(new Square());
    }
}
