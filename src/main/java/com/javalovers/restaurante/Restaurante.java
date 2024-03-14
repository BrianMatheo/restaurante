package com.javalovers.restaurante;
import java.util.Scanner;
import people.User;
import values.UserTypes;
public class Restaurante {

    public static void main(String[] args) {
        User student = new User(UserTypes.STUDENT, "Fulanito","241873");
        student.sell();
    }
}
