package Obey;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class OCPMaing
{
    TotalLength t;

    public int getSquareLength()
    {
        t = new Square();
        return t.totalLength();
    }

    public int getRectangleLength()
    {
        t = new Rectangle();
        return t.totalLength();
    }
}
