package com.javalovers.restaurante;
import foods.Dish;
import java.util.Scanner;
import java.util.ArrayList;
import people.User;
import foods.Menu;
import values.UserTypes;
import values.DishTypes;
import values.DishVariation;

public class Restaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stay = "inside";
        ArrayList<String> arrayList = new ArrayList<>();
        UserTypes usertype = null;
        while(stay == "inside"){
            System.out.println("what kind of user you are?");
            System.out.println("student");
            System.out.println("teacher");
            System.out.println("administrative");
            String InputTypeUser = scanner.next();
            switch(InputTypeUser){
                case "student":
                usertype = UserTypes.STUDENT;
                stay = "outside";
                break;
                case "teacher":
                usertype = UserTypes.TEACHER;
                stay ="outside";
                break;
                case "administrative":
                usertype = UserTypes.ADMINISTRATIVE;
                stay = "outside";
                break;
                default:
                    System.out.println("please, write the correct user");
                    stay = "inside";
                    break;
        }
        }
                
                Menu menu = new Menu();
                
                Dish dish1 = new Dish("Huevos pericos",DishTypes.BREAKFAST,20,2400,DishVariation.OPTION1);
                Dish dish2 = new Dish("Caldo con arepa",DishTypes.BREAKFAST,20,2400,DishVariation.OPTION2);
                Dish dish3 = new Dish("Empanada de pollo",DishTypes.BREAKFAST,50,2000,DishVariation.OPTION3);
                Dish dish4 = new Dish("Arroz chino",DishTypes.LUNCH,20,2400,DishVariation.OPTION1);
                Dish dish5 = new Dish("Pollo broaster",DishTypes.LUNCH,500,2400,DishVariation.OPTION2);
                Dish dish6 = new Dish("Carne asada",DishTypes.LUNCH,400,2400,DishVariation.OPTION3);
                Dish dish7 = new Dish("Sushi",DishTypes.DINNER,60,2400,DishVariation.OPTION1);
                Dish dish8 = new Dish("Pizza",DishTypes.DINNER,40,2400,DishVariation.OPTION2);
                Dish dish9 = new Dish("Salchipapa",DishTypes.DINNER,30000,14500,DishVariation.OPTION3);
                int prices = 2400;
                
                menu.addDish(dish1);
                menu.addDish(dish2);
                menu.addDish(dish3);
                menu.addDish(dish4);
                menu.addDish(dish5);
                menu.addDish(dish6);
                menu.addDish(dish7);
                menu.addDish(dish8);
                menu.addDish(dish9);
                
                menu.showMenu();
                
        stay = "inside";
        DishTypes dish = null;
        while(stay == "inside"){
            System.out.println("what do you want to eat?");
            System.out.println("breakfast");
            System.out.println("lunch");
            System.out.println("dinner");
            String food = scanner.next();
            switch(food){
                case "breakfast":
                    dish = DishTypes.BREAKFAST;
                    stay = "outside";
                    break;
                case "lunch":
                    dish = DishTypes.LUNCH;
                    stay = "outside";
                    break;
                case "dinner":
                    dish = DishTypes.DINNER;
                    stay = "outside";
                    break;
                default:
                    System.out.println("please, write the correct food");
                    stay = "inside";
                    break;
            }
        }
        
                System.out.println("say your name");
                String name = scanner.next();
                System.out.println("say your id");
                String id = scanner.next();
                arrayList.add(name);
                arrayList.add(id);
                User student = new User(name,id,usertype,dish);
                student.information();
        stay = "inside";
        String options;
        DishVariation variation = null;
        switch(dish){
            case BREAKFAST:
                while(stay=="inside"){
                System.out.println("what breakfast do you want?");
                System.out.println("option1");
                System.out.println("option2");
                System.out.println("option3");
                options = scanner.next();
                switch(options){
                    case "option1":
                        variation = DishVariation.OPTION1;
                        stay = "outside";
                        break;
                    case "option2":
                        variation = DishVariation.OPTION2;
                        stay = "outside";
                        break;
                    case "option3":
                        variation = DishVariation.OPTION3;
                        stay = "outside";
                        break;
                    default:
                        stay = "inside";
                        System.out.println("write the correct option");
                        break;
                }
                }
            case LUNCH:
                while(stay=="inside"){
                System.out.println("what lunch do you want?");
                System.out.println("option1");
                System.out.println("option2");
                System.out.println("option3");
                options = scanner.next();
                switch(options){
                    case "option1":
                        variation = DishVariation.OPTION1;
                        stay = "outside";
                        break;
                    case "option2":
                        variation = DishVariation.OPTION2;
                        stay = "outside";
                        break;
                    case "option3":
                        variation = DishVariation.OPTION3;
                        stay = "outside";
                        break;
                    default:
                        stay = "inside";
                        System.out.println("write the correct option");
                        break;
                }
            }
            case DINNER:
                while(stay=="inside"){
                System.out.println("what dinner do you want?");
                System.out.println("option1");
                System.out.println("option2");
                System.out.println("option3");
                options = scanner.next();
                switch(options){
                    case "option1":
                        variation = DishVariation.OPTION1;
                        stay = "outside";
                        break;
                    case "option2":
                        variation = DishVariation.OPTION2;
                        stay = "outside";
                        break;
                    case "option3":
                        variation = DishVariation.OPTION3;
                        stay = "outside";
                        break;
                    default:
                        stay = "inside";
                        System.out.println("write the correct option");
                        break;
                }
            }
        }
        stay = "inside";
        User buyer = new User(name,id,usertype,dish);
        if(usertype==UserTypes.STUDENT){
            System.out.println("you are " + UserTypes.STUDENT + " that means you can only buy food");
            System.out.println("redirected to purchases");
            buyer.buy(prices);
        }else if(usertype==UserTypes.TEACHER){
            System.out.println("you are " + UserTypes.TEACHER + " that means you can only buy food");
            System.out.println("redirected to purchases");
            buyer.buy(prices);
        }else{
            while(stay=="inside"){
            System.out.println("you are " + UserTypes.ADMINISTRATIVE + " that means you can select any options");
            System.out.println("choose buy or sell");
            String select = scanner.next();
            switch(select){
                case "buy":
                stay="outside";
                buyer.buy(prices);
                case "sell":
                stay="outside";
                buyer.sell(prices);
                default:
                System.out.println("write the correct option");
                stay="inside";
                }
            }
        }
    }
}

