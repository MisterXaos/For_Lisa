package org.example;

public class App {
    public static void main(String[] args) {
//        DbConnectionImpl connection = new DbConnectionImpl();
//
//        connection.insert(new User("user", "1234"));
//
//        connection.select();

//        EncryptionPass pass = new EncryptionPass();
//        var passwords = "12345";
//
//
//        var encrypt = pass.encrypt(passwords);
//
//
//        System.out.println("Зашиврованный " + encrypt);
//
//        System.out.println("Расшивровка " + pass.decrypt(encrypt));

        DbConnectionImpl connection = new DbConnectionImpl();

//        connection.insert(new User("user3", "sgiusgf"));
//        connection.insert(new User("user4", "1235ybi w34"));
//        connection.insert(new User("user5", "dsffdfd"));
//        connection.insert(new User("user6", "admiin"));

        connection.select();


    }
}
