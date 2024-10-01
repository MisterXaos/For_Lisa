package org.example;

public class Products {
    private long id;
    private String product_name;

    private double price;

    public Products(String product_name, double price) {
        this.product_name = product_name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
