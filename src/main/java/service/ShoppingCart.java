package service;
import model.Food;

public class  ShoppingCart {
   // int totalPrice;
   public Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
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
            sum += food.amount * food.price;
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
            if (food.isVegetarian) {
                sum += food.amount * food.price;
            }
        }
        return sum;
    }
}
