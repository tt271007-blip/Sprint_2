package service;
import model.Discountable;
import model.Food;
import model.constants.Discount;

public class ShoppingCart {

    public Food[] items;
    private Discountable discountable;

    public ShoppingCart(Food[] items) {
        this.items = items;
        this.discountable = new Discount();
    }

    public Food[] getItems() {
        return items;
    }

    public void setItems(Food[] items) {
        this.items = items;
    }


    public Double totalPrice() {
        double sum = 0.0;
        for (Food food: items) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public Double totalPriceDiscount() {
        double sum = 0.0;
        for (Food food: items) {
            sum += food.getAmountSale();
        }
        return sum;
    }

    public Double totalWegeterianSum(){
        double sum = 0.0;
        for (Food food: items) {
            if (food.getVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}