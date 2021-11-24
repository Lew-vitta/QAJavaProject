package com.vitta.SkateXut.DTO;

import com.vitta.SkateXut.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@ToString
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
