package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public class StockActivities
{
    private StockOptions so;

    public StockActivities(StockOptions so)
    {
        this.so = so;
    }

    public void UserInstructions()
    {
        so.getUsersBal("2222");
    }
}
