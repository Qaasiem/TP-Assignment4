import Obey.Chicken;
import Obey.Fish;
import Obey.Restraunt;
import Violate.Chicken2;
import Violate.Fish2;
import Violate.Restraunt1;
import junit.framework.TestCase;


/**
 * Created by qaasiem on 2017-03-30.
 */
public class TestDIP extends TestCase
{
    ////        Good      ////
    Chicken c = new Chicken();
    Fish f = new Fish();
    Restraunt restrauntObey = new Restraunt();

    public void testFish() throws Exception {
        assertEquals(restrauntObey.Fish1().getClass(), f.getClass());
    }


    public void testChicken() throws Exception {
        assertEquals(restrauntObey.Chicken1().getClass(), c.getClass());
    }

    ////        Bad      ////
    Restraunt1 restrauntobey1 = new Restraunt1();
    Chicken2 c1 = new Chicken2();
    Fish2 f1 = new Fish2();


    public void testFish1() throws Exception {
        assertEquals(restrauntobey1.Fish2().getClass(), f1.getClass());
    }

    public void testChicken1() throws Exception {
        assertEquals(restrauntobey1.Chicken2().getClass(), c1.getClass());
    }


}
