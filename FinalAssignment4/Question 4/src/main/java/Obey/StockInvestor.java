package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class StockInvestor extends StockUserAcc implements StockOptions
{
    public double getUsersBal(String accNum) {
        return getAvailableFunds(accNum);
    }

    public boolean checks(String identity) {
        return true;
    }
}
