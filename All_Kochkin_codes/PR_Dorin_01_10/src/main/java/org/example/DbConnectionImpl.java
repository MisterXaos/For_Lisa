package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionImpl implements DbConnection{
    @Override
    public void insert(all_users all_users) {
        try {
            var request = "INSERT INTO public.all_users" +
                    "(name, surname, patronymic, login, password)" +
                    " VALUES(?, ?, ?, ?, ?)";

            var connection = connect();

            var prepareStatement = connection.prepareStatement(
                    request, Statement.RETURN_GENERATED_KEYS

            );

//            prepareStatement.setString(1, user.getUsername());
//            prepareStatement.setString(2, EncryptionPass.encrypt(user.getPassword()));
            prepareStatement.setString(0, all_users.getId());
            prepareStatement.setString(1, all_users.getName());
            prepareStatement.setString(2, all_users.getSurname());
            prepareStatement.setString(3, all_users.getPatronymic());
            prepareStatement.setString(4, all_users.getLogin());
            prepareStatement.setString(5, all_users.getPassword());

            prepareStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
        }
        catch (SQLException e) {
            System.out.println("Data insertion failed. Please, try again!");
            System.out.println(e);
        }
    }

    @Override
    public void updete() {

    }

    @Override
    public void select() {
        try {
            String request = "SELECT * FROM public.all_users";
            Statement statement = connect().createStatement();
            ResultSet resultSet = statement.executeQuery(request);

            while (resultSet.next()) {

                var id =  resultSet.getString("id");
                var name = resultSet.getString("name");
                var surname = resultSet.getString("surname");
                var patronymic = resultSet.getString("patronymic");
                var login = resultSet.getString("login");
                var password = resultSet.getString("password");


                System.out.println(
                        "ID - " + id +
                        " ,name - " + name +
                        " ,surname - " + surname +
                        " , patronymic - "  + patronymic +
                        " , login  - " + login +
                        " ,password - " + password
                        );

            }
        } catch (SQLException e) {
            System.out.println("Cannot load data from db. Please try again.");
        }
    }

    @Override
    public void selete() {

    }


//    public void showDate(Connection connection){
//        if(connection != null){
//            try {
//                String request = "SELECT * FROM public.users";
//                Statement statement = connection.createStatement();
//
//                ResultSet resultSet = statement.executeQuery(request);
//                while (resultSet.next()){
//
//                    var id = resultSet.getLong("id");
//                    var username = resultSet.getString("username");
//                    var password = resultSet.getString("password");
//
//                    System.out.println("id - " + id + " username - " + username +
//                            " password - " +password);
//                }
//            } catch (SQLException e) {
//                System.out.print("Failed ro load data from db. Please? try again later");
//                throw new RuntimeException(e);
//            }
//        }
//    }
}

