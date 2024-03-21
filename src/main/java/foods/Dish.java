package foods;
import values.DishTypes;
import values.DishVariation;
public class Dish {
    String name;
    DishTypes type;
    int stock;
    int price;
    DishVariation variation;

    public Dish(String name, DishTypes type, int Stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.stock = Stock;
        this.price = price;
        this.variation = variation;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
    
}
