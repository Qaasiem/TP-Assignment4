import Inheritance.Motorbike;
import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class InheriTest extends TestCase
{
    public void testMotorbike() throws Exception {

        Motorbike m =  new Motorbike();
        m.setModel(2017);

        assertEquals(m.getModel(),2017);
    }
}
