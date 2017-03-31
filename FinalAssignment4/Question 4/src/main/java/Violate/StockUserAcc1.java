package Violate;

/**
 * Created by qaasiem on 2017-03-31.
 */
public class StockUserAcc1
{
    private StockInvestor1 user1;

    public void buy(String identity, double amm)
    {
        user1 = new StockInvestor1();
        if(user1.checks(identity))
        {
            System.out.println("You deposited R" + amm + " into " + identity + " account");
        }
    }

    public double getBal(String accNum)
    {
        System.out.println("Remainder");
        return 0;
    }
}
