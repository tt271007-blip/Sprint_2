import model.Apple;
import model.Food;
import model.Meet;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String [] args) {
        Food meet = new Meet(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED);
        Food appleGreen = new Apple(8, 60, Colour.GREEN);
        Food[] items = {meet, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(items);
        System.out.println(shoppingCart.totalPrice(items));
        System.out.println(shoppingCart.totalPriceDiscount(items));
        System.out.println(shoppingCart.totalWegeterianSum(items));
    }
}