package model;
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food{

    private final String color;
    private final Discountable discountable;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color=color;
        this.discountable = new Discount();
    }

    @Override
    public Double getAmountSale() {
        if (color.equals(Colour.RED)) {
            return discountable.getDiscount(amount * price);
        }
        else {
            return amount * price;
        }
    }
}