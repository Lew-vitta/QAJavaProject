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
}
