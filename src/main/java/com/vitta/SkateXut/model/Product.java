package com.vitta.SkateXut.model;


import javax.persistence.Entity;


public class Product{

    private String Product;
    private int Barcode;
    private String Description;
    private String Colour;
    private String Dimentions;
    private String Materials;

    public Product(String product) {
        Product = product;
    }

    public Product(String product, int barcode) {
        this.Product = product;
        this.Barcode = barcode;
    }

    public Product(String product, int barcode, String description, String colour, String dimentions, String materials) {
        this.Product = product;
        this.Barcode = barcode;
        this.Description = description;
        this.Colour = colour;
        this.Dimentions = dimentions;
        this.Materials = materials;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int barcode) {
        this.Barcode = barcode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getDimentions() {
        return Dimentions;
    }

    public void setDimentions(String dimentions) {
        this.Dimentions = dimentions;
    }

    public String getMaterials() {
        return Materials;
    }

    public void setMaterials(String materials) {
        Materials = materials;
    }
}