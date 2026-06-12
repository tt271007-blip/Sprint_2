package model;


import static model.constants.Discount.SALE;

public  class Food implements Discountable {

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


    public Double getPrice() {
        return price;
    }

    public Boolean getVegetarian() {
        return isVegetarian;
    }

    @Override
    public Double getDiscount(Double price) {
        return price * SALE;
    }
}