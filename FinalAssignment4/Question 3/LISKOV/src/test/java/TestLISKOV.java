import Obey.CarMain1;
import Violate.CarMain;
import junit.framework.TestCase;


/**
 * Created by qaasiem on 2017-03-30.
 */
public class TestLISKOV extends TestCase
{
    ////      OBEY       ////
    CarMain1 c1 = new CarMain1();


    public void testBusSize() throws Exception {
        assertEquals(c1.getBusSize1(), 200);
    }


    public void testWidth() throws Exception {
        assertEquals(c1.getWidth1(), 20);
    }

    ////      VIOLATE      ////
    CarMain c = new CarMain();

    public void testSize() throws Exception {
        assertEquals(c.getBusSize(),150);
    }

    public void testWidth1() throws Exception {
        assertEquals(c.getCarWidth(),12);
    }
}
