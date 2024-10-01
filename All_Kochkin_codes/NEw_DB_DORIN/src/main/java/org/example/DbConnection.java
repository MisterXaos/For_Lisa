package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DbConnection {

    default Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/auth_dp",
                    "postgres", "admin");
            System.out.println("Connection successed!");
            return connection;
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Connectyion failed! Please try again!");
            return null;
        }
    }

    void insert(User user);
    void updete();
    void select();
    void selete();

}
