package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionmpl implements DbConnection{
    @Override
    public void insert(TVStoreDorin TVStoreDorin) {
        try{

            var request = "INSERT INTO public." +
                    "tvs_store_dorin" +
                    "(manufacturer, model," +
                    "matrix_type, display_diagonal, amount_usb_a, " +
                    "amount_hdmi, amount_in_storage, price, " +
                    "screen_resolution) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            var connetion = connect();
            var prepapareStatemenet = connetion.prepareStatement(
                    request, Statement.RETURN_GENERATED_KEYS

            );

            prepapareStatemenet.setString(1, TVStoreDorin.getManufacturer());
            prepapareStatemenet.setString(2, TVStoreDorin.getModel());
            prepapareStatemenet.setString(3, TVStoreDorin.getMatrix_type());
            prepapareStatemenet.setDouble(4, TVStoreDorin.getDisplay_diagonal());
            prepapareStatemenet.setInt(5, TVStoreDorin.getAmount_USB_A());
            prepapareStatemenet.setInt(6, TVStoreDorin.getAmount_HDMI());
            prepapareStatemenet.setInt(7, TVStoreDorin.getAmount_in_storage());
            prepapareStatemenet.setDouble(8, TVStoreDorin.getPrice());
            prepapareStatemenet.setString(9, TVStoreDorin.getScreen_resolution());

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
                String request = "SELECT * FROM public.TVStoreDorin";
                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery(request);
                while (resultSet.next()){

                    long id = resultSet.getLong("id");
                     String manufacturer = resultSet.getString("manufacturer");
                     String model = resultSet.getString("model");
                     String matrix_type = resultSet.getString("matrix_type");
                     double display_diagonal = resultSet.getDouble("display_diagonal");
                     int amount_USB_A =resultSet.getInt("amount_USB_A");
                     int amount_HDMI =resultSet.getInt("amount_HDMI");
                     int amount_in_storage =resultSet.getInt("amount_in_storage");
                     double price =resultSet.getDouble("price");
                     String screen_resolution =resultSet.getString("screen_resolution");

                    System.out.println("id - " + id + " manufacturer - " + manufacturer +
                            " model - " + model + " matrix_type - " + matrix_type +
                            " display_diagonal - " + display_diagonal + " amount_USB_A " + amount_USB_A +
                            " amount_HDMI - " + amount_HDMI + " amount_in_storage - " + amount_in_storage +
                            " price - " + price + " screen_resolution - " + screen_resolution
                            );
                }
            } catch (SQLException e) {
                System.out.print("Failed ro load data dfrom db. Please? try again later");
                throw new RuntimeException(e);
            }
        }
    }
}

