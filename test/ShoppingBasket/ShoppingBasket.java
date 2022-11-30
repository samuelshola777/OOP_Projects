package ShoppingBasket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShoppingBasket {

   private TheShoppingBasket basket;
    @BeforeEach
    void setupB() {
        basket = new TheShoppingBasket();
    }

    @Test
    void ifObjectExit(){
        assertNotNull(basket);
    }




}
