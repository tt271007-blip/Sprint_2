import model.Apple;
import model.Food;
import model.Meet;
import model.constants.Colour;
import service.ShoppingCart;

public class main {

    public static void main(String [] args) {
        Food meet = new Meet(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED);
        Food appleGreen = new Apple(10, 50, Colour.GREEN);
        Food[] items = {meet, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(items);
        System.out.println(shoppingCart.totalPrice());
        System.out.println(shoppingCart.totalPriceDiscount());
        System.out.println(shoppingCart.totalWegeterianSum());
    }
}
