package people;
import values.UserTypes;
import java.util.Scanner;
import foods.Dish;
import values.DishTypes;
public class User {
    Scanner scanner = new Scanner(System.in);
    private UserTypes usertype;
    String name;
    String id;
    private DishTypes dish;

    public User(String name, String id, UserTypes usertype, DishTypes dish) {
        this.name = name;
        this.id = id;
        this.usertype = usertype;
        this.dish = dish;
    }
    
    public void information(){
        System.out.println("your name is " + this.name);
        System.out.println("your id is " + this.id);
}

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void buy (int price){
        if(this.usertype==UserTypes.STUDENT){
        System.out.println("Your purchase has been made, the total cost is: " + price  );
        }else if(this.usertype==UserTypes.TEACHER && this.dish==DishTypes.LUNCH){
        System.out.println("Your purchase has been made, the total cost is: " + ((price) + (price*1/2))  );
    }else if(this.usertype==UserTypes.TEACHER){
            System.out.println("Your purchase has been made, the total cost is: " + price);
    }else{
            System.out.println("Your purchase has been made, the total cost is: " + price);
    }
    }
    
    public void sell(int price){
        System.out.println("you have sold the selected food, fantastic!");
    }

    public User(UserTypes types, String name, String id) {
        this.usertype = types;
        this.name = name;
        this.id = id;
    }
    
    
    
    
    
}
