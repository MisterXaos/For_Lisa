package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionmpl implements DbConnection{
    @Override
    public void insert(Products products) {
        try {

            var request = "INSERT INTO public.products(product_name," +
                    " price) VALUES(?, ?)";

            var connetion = connect();
            var prepapareStatemenet = connetion.prepareStatement(
                    request, Statement.RETURN_GENERATED_KEYS

            );

            prepapareStatemenet.setString(1, products.getProduct_name());
            prepapareStatemenet.setDouble(2, products.getPrice());

            prepapareStatemenet.executeUpdate();

            System.out.println("Data inserted successfully");
        } catch (SQLException e) {

            System.out.println("Data insertion failed. Please, try again");
            System.out.println(e);
        }
    }

    @Override
    public void updete() {

    }

    @Override
    public void select() {

    }

    @Override
    public void selete() {

    }

    public void showDate(Connection connection){
        if(connection != null){
            try {
                String request = "SELECT * FROM public.auto_shop";
                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(request);
                while (resultSet.next()){
                    long id = resultSet.getLong("id");
                    String model = resultSet.getString("model");
                    double price  = resultSet.getDouble("price");

                    System.out.println("id " + id + ", model: " + model + ", price: " + price);
                }
            } catch (SQLException e) {
                System.out.print("Failed ro load data dfrom db. Please? try again later");
                throw new RuntimeException(e);
            }
        }
    }
}
