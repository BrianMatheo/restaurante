package foods;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;
    
    public Menu(){
        this.dishList = new ArrayList();
    }
    
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }
    
    public void showMenu(){
        System.out.println(dishList);
    }
}
