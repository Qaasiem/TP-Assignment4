package Violate;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class StockInvestor1 extends StockUserAcc1
{
    public double getUserBal(String accNum)
    {
        return getBal(accNum);
    }

    public boolean checks(String identity)
    {
        return true;
    }
}
