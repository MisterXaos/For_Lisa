package org.example;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        DbConnectionmpl connectionmpl =  new DbConnectionmpl();

        connectionmpl.insert(new TVStoreDorin(
                "AAAA","SAMSUNG", "Aly_OLED",
                43567, 52, 23,
                0, 4835683.4356, "128k HD"));

        connectionmpl.insert(new TVStoreDorin(
                "BBB","AMOGUS_COMP", "HHDD_matrix",
                2000000, 235, 2,
                3, 99999999.9999, "512k HD"));


    }
}
