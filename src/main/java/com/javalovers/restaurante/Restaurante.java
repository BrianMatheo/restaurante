package com.javalovers.restaurante;
import java.util.Scanner;
import people.User;
import values.UserTypes;
import values.DishTypes;
import values.DishVariation;

public class Restaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stay = "inside";
        UserTypes user = null;
        while(stay == "inside"){
            System.out.println("what kind of user you are?");
            System.out.println("student");
            System.out.println("teacher");
            System.out.println("administrative");
            String User = scanner.next();
            switch(User){
                case "student":
                user = UserTypes.STUDENT;
                stay = "outside";
                break;
                case "teacher":
                user = UserTypes.TEACHER;
                stay ="outside";
                break;
                case "administrative":
                user = UserTypes.ADMINISTRATIVE;
                stay = "outside";
                break;
                default:
                    System.out.println("please, write the correct user");
                    stay = "inside";
                    break;
        }
        }
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
    }
}

