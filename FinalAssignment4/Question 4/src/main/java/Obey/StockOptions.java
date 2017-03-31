package Obey;

/**
 * Created by qaasiem on 2017-03-30.
 */
public interface StockOptions
{
    void buy(StockOptions so, String identity, double purchaceAmm);
    double getAvailableFunds(String accNum);
    double getUsersBal(String accNum);
    boolean checks(String identity);


}
