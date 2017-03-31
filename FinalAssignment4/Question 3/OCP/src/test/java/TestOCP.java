import Obey.OCPMaing;
import Violate.OCPMain;
import junit.framework.TestCase;


/**
 * Created by qaasiem on 2017-03-29.
 */
public class TestOCP extends TestCase
{
    ///////    BAD       //////

    OCPMaing ocp = new OCPMaing();

    public void testSquareLength() throws Exception {
        assertEquals(ocp.getSquareLength(), 2);
    }


    public void testSquareRadius() throws Exception {
        assertEquals(ocp.getRectangleLength(), 3);
    }

    ///////    GOOD       //////

    OCPMain ocp1 = new OCPMain();

    public void testLength() throws Exception
    {
        assertEquals(ocp1.getSquare(), 6);
    }
}
