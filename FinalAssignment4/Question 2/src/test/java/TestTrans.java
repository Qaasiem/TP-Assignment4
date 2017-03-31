import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class TestTrans extends TestCase
{
    Car c1 = new Audi().getCar();

    public void testModel() throws Exception {
        c1.setModel(2016);
        assertEquals(c1.getModel(),2016);
    }


    public void testMake() throws Exception {
        c1.setMake("Audi");
        assertEquals(c1.getMake(),"Audi");
    }
}
