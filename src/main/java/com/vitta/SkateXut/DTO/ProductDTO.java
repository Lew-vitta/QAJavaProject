package com.vitta.SkateXut.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@Setter
@ToString
@DynamicUpdate
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

    public ProductDTO(int barcode, String productName, String description, String colour, String dimentions, String materials, int stock) {
        this.Barcode = barcode;
        this.ProductName = productName;
        this.Description = description;
        this.Colour = colour;
        this.Dimentions = dimentions;
        this.Materials = materials;
        this.Stock = stock;
    }
}
