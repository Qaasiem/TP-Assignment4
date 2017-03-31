import Obey.StockActivities;
import Obey.StockInvestor;
import Obey.StockUserAcc;
import Violate.StockUserAcc1;
import junit.framework.TestCase;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class TestADP extends TestCase
{
    public void testObey() throws Exception {
        StockUserAcc si = new StockUserAcc();
        si.buy(new StockInvestor(),"Thabo", 200.000000);
        StockActivities so = new StockActivities(new StockInvestor());
        so.UserInstructions();
    }

    public void testViolate() throws Exception {
        StockUserAcc1 user1 = new StockUserAcc1();
        user1.buy("Thabo", 200.00000);
        user1.getBal("221321");
    }
}
