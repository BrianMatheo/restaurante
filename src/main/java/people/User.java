package people;
import values.UserTypes;
public class User {
    private UserTypes types;
    String name;
    String id;
    
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
