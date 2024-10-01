package org.example;

import java.util.Scanner;

public class NewUser {

    public static void NewUser(){

        String id =null;
        String name =null;
        String surname =null;
        String patronymic =null;
        String login =null;
        String password =null;

        DbConnectionImpl connection = new DbConnectionImpl();

        connection.insert(new all_users(id, name, surname,patronymic, login, password));
    }

    private String bazeletter(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ваша специальность: " +
                "Выберите из предложаного списка?(" +
                " 1. менеджер " +
                " 2. администратор " +
                " 3. инженер " +
                ")"
        );
        String name_prof;
        while (true){
            System.out.println("Ввод: ");
            name_prof = scanner.nextLine();
            switch (name_prof){
                 case "1":{
                    return "M";
                 } case "2":{
                    return "A";
                } case "3":{
                    return "E";
                } default:{
                    System.out.println("Некоретный ввод, повтроите");
                }
            }
        }
    }
}
