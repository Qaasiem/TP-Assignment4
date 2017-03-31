package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class StockUserAcc
{
    public void buy(StockOptions so, String identity, double purchaceAmm)
    {
        if(so.checks("Thabo"))
        {
            System.out.println("Amount R" + purchaceAmm + " into " + identity + " account");
        }
    }

    public double getAvailableFunds(String accNum)
    {
        System.out.println("Remainder");
        return 0.1;
    }
}
