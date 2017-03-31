package Bad;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class ArrangedBasket
{
    protected List <String> shoppingProducts = new ArrayList<String>();

    public void addProduct(String product) {
        shoppingProducts.add(product);
    }

    public String getProduct(int productIndex) {
        return shoppingProducts.get(productIndex);
    }
}
