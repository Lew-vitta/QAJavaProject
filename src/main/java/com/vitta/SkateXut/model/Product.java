package com.vitta.SkateXut.model;


import org.hibernate.validator.internal.util.logging.formatter.CollectionOfObjectsToStringFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(unique = true)
    private int barcode;

    @Column
    private String productName;

    @Column
    private String description;

    @Column
    private String colour;

    @Column
    private String dimentions;

    @Column
    private String materials;

    @Column
    private int stock;

    public Product() {
    }

    public Product(int barcode, String productName) {
        this.barcode = barcode;
        this.productName = productName;
    }

    public Product(int barcode, String productName, String description, String colour, String dimentions, String materials, int stock) {
        this.barcode = barcode;
        this.productName =  productName;
        this.description = description;
        this.colour = colour;
        this.dimentions = dimentions;
        this.materials = materials;
        this.stock = stock;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDimentions() {
        return dimentions;
    }

    public void setDimentions(String dimentions) {
        this.dimentions = dimentions;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

