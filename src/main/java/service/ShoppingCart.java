package service;
import model.Food;

public class ShoppingCart {

    public Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public Double totalPrice(Food[] items) {
        double sum = 0.0;
        for (Food food: items) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public Double totalPriceDiscount(Food[] items) {
        double sum = 0.0;
        for (Food food: items) {
            sum += food.getAmountSale();
        }
        return sum;
    }

    public Double totalWegeterianSum(Food[] items){
        double sum = 0.0;
        for (Food food: items) {
            if (food.getVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}