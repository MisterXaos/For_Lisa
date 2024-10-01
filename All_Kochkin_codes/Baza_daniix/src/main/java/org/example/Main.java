package org.example;



public class Main {
    public static void main(String[] args) {
        DbConnectionmpl connection = new DbConnectionmpl();
//        connection.showDate(connection.connect());
        connection.insert(new Products("AAAAAAA" , 438564));
    }
}