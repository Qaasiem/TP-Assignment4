import Encapsulation.Car;
import junit.framework.TestCase;

import static junit.framework.Assert.assertNotSame;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class EncapTest extends TestCase
{
    Car c = new Car();
    public void testCar() throws Exception
    {
        c.setMake("Audi");
        assertEquals(c.getMake(),"Audi");
    }

    public void testName() throws Exception
    {
        c.setModel(2012);
        assertEquals(c.getModel(),2012);
    }
}
