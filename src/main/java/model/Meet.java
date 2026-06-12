package model;

public class Meet extends Food {

    public  Meet(int amount, double price) {
        super(amount, price, false);
    }

    @Override
    public Double getDiscount(Double price) {
        return 0.0;
    }
}