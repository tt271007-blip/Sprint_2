package model;
import model.constants.Colour;
import model.Apple;
import static model.constants.Colour.RED;

public abstract  class Food {

    public Integer amount;
    public Double price;
    public Boolean isVegetarian;

    public Food(Integer amount, Double price, Boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
public Double getAmountSale(){
    return amount * price;
}
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        isVegetarian = vegetarian;
    }
}