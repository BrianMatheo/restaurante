package people;
import values.UserTypes;
import java.util.Scanner;
public class User {
    Scanner scanner = new Scanner(System.in);
    private UserTypes types;
    String name;
    String id;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
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
    
    public void buy (){
        
    }
    
    public void sell(){
        if(this.types != UserTypes.ADMINISTRATIVE){
            System.out.println("Usted no está autorizado para vender");
        }
    }

    public User(UserTypes types, String name, String id) {
        this.types = types;
        this.name = name;
        this.id = id;
    }
    
    
    
}
