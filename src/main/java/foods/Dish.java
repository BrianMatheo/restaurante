package foods;
import values.DishTypes;
import values.DishVariation;
public class Dish {
    String name;
    DishTypes type;
    int Stock;
    int price;
    DishVariation variation;

    public Dish(String name, DishTypes type, int Stock, int price, DishVariation variation) {
        this.name = name;
        this.type = type;
        this.Stock = Stock;
        this.price = price;
        this.variation = variation;
    }
    
    
}
