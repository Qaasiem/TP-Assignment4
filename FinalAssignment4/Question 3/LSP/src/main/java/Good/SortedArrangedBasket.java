package Good;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class SortedArrangedBasket implements ShoppingBasket
{
    private List<String> shoppingItems = new ArrayList<String>();

    public String getProduct(int productIndex) {
        return shoppingItems.get(productIndex);
    }
    public void addProduct(String product) {
        shoppingItems.add(product);
        Collections.sort(shoppingItems);
    }
}
