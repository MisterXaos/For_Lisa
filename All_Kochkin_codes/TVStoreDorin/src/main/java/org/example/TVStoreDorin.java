package org.example;

import java.io.StringReader;

public class TVStoreDorin {
    private long id;
    private String manufacturer;
    private String model;
    private String matrix_type;
    private double display_diagonal;
    private int amount_USB_A;
    private int amount_HDMI;
    private int amount_in_storage;
    private double price;
    private String screen_resolution;

    public TVStoreDorin(String manufacturer, String model,
                        String matrix_type, double display_diagonal,
                        int amount_USB_A, int amount_HDMI,
                        int amount_in_storage, double price,
                        String screen_resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.matrix_type = matrix_type;
        this.display_diagonal = display_diagonal;
        this.amount_USB_A = amount_USB_A;
        this.amount_HDMI = amount_HDMI;
        this.amount_in_storage = amount_in_storage;
        this.price = price;
        this.screen_resolution = screen_resolution;
    }

    public long getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getMatrix_type() {
        return matrix_type;
    }

    public double getDisplay_diagonal() {
        return display_diagonal;
    }

    public int getAmount_USB_A() {
        return amount_USB_A;
    }

    public int getAmount_HDMI() {
        return amount_HDMI;
    }

    public int getAmount_in_storage() {
        return amount_in_storage;
    }

    public double getPrice() {
        return price;
    }

    public String getScreen_resolution() {
        return screen_resolution;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMatrix_type(String matrix_type) {
        this.matrix_type = matrix_type;
    }

    public void setDisplay_diagonal(double display_diagonal) {
        this.display_diagonal = display_diagonal;
    }

    public void setAmount_USB_A(int amount_USB_A) {
        this.amount_USB_A = amount_USB_A;
    }

    public void setAmount_HDMI(int amount_HDMI) {
        this.amount_HDMI = amount_HDMI;
    }

    public void setAmount_in_storage(int amount_in_storage) {
        this.amount_in_storage = amount_in_storage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setScreen_resolution(String screen_resolution) {
        this.screen_resolution = screen_resolution;
    }
}