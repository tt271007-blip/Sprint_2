package model;
import model.constants.Colour;

public class Apple extends Food{

    private final String color;


    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color=color;
    }

    @Override
    public Double getAmountSale() {
        if (color.equals(Colour.RED)) {
            return getDiscount(amount * price);
        }
        else {
            return amount * price;
        }
    }
}