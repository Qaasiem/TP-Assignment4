package Bad;

import java.util.Collections;

/**
 * Created by qaasiem on 2017-03-29.
 */
public class SortedArrangedBasket extends ArrangedBasket
{

    public void addProduct(String product) {
        super.addProduct(product);
        Collections.sort(super.shoppingProducts);
    }
}
