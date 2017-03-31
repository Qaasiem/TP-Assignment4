import Obey.Audi;
import Obey.BMW;
import Violate.Audi1;
import Violate.BMW1;
import junit.framework.TestCase;


/**
 * Created by qaasiem on 2017-03-30.
 */
public class TestISP extends TestCase
{


    public void testViolate() throws Exception {

        BMW1 b = new BMW1();
        b.colour1();
        b.model1();
        b.transmission1();
        b.brand1();

        Audi1 a = new Audi1();
        a.colour1();
        a.model1();
        a.transmission1();
        a.brand1();
    }


    public void testObey() throws Exception {

        BMW b1 = new BMW();
        b1.colour();
        b1.model();
        b1.transmission();
        b1.brand();

        Audi a1 = new Audi();
        a1.colour();
        a1.model();
        a1.transmission();
        a1.brand();

    }
}
