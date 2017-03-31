import Polymorphism.Apple;
import Polymorphism.Fruit;
import Polymorphism.Mango;
import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class PolyTest extends TestCase
{
    Fruit f = new Apple("all-year", "circular",13,25);
    Fruit f1 = new Mango("summer", "oval",18,40);

    public void testApple() throws Exception
    {
        assertEquals(f.toString(),"This fruit is most likely to be found in the all-year season and is circular shape");
    }

    public void testMango() throws Exception
    {
        assertEquals(f1.toString(),"This fruit is most likely to be found in the summer season and is oval shape");
    }
}
