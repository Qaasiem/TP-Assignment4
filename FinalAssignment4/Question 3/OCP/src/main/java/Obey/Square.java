package Obey;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class Square implements TotalLength
{
    int length = 4;
    public int totalLength()
    {
        return ((int) Math.sqrt((length * length) / 2));
    }
}
