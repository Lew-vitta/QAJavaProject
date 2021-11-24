package com.vitta.SkateXut.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product{

    @Column(name = "Product_name")
    private String Product;

    @Column(name = "Product_Barcode", unique = true)
    private int Barcode;

    private String Description;
    private String Colour;
    private String Dimentions;
    private String Materials;
    private int Stock;

    public Product(String product) {
        Product = product;
    }

    public Product(String product, int barcode) {
        super();
        this.Product = product;
        this.Barcode = barcode;
    }

    public Product(String product, int barcode, String description, String colour, String dimentions, String materials, int stock) {
        super();
        this.Product = product;
        this.Barcode = barcode;
        this.Description = description;
        this.Colour = colour;
        this.Dimentions = dimentions;
        this.Materials = materials;
        this.Stock = stock;
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

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }
}