package model.constants;

import model.Discountable;

public class Discount implements Discountable {  // для значений скидок,

    public static final Double SALE = 0.6;

    @Override
    public Double getDiscount(Double price) {
        return price * SALE;
    }

}