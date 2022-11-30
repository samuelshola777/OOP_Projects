package BoneshakerEstore;

import java.math.BigDecimal;

public class Product extends Items{
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private String productDescription;
    private enum productCategory{ELECTRONICS, GROCERIES, UTENSILS ,CLOTHING}
}
