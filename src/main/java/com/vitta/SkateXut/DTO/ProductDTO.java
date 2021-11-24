package com.vitta.SkateXut.DTO;

import com.vitta.SkateXut.model.Product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class ProductDTO {

    private int Barcode;
    private String ProductName;
    private String Description;
    private String Colour;
    private String Dimentions;
    private String Materials;
    private int Stock;

    public ProductDTO(){
        super();
    }

    public String getProduct() {
        return ProductName;
    }

    public void setProduct(com.vitta.SkateXut.model.Product product) {
        this.ProductName = String.valueOf(product);
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
        this.Description = description;
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
        this.Materials = materials;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }
}
