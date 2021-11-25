package com.vitta.SkateXut.controller;

import com.vitta.SkateXut.DTO.ProductDTO;
import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private final ProductService service;

    @Autowired
    public ProductController(ProductService service){
        super();
        this.service = service;
    }

    // Create Product
    @PostMapping("/addProduct")
    public ProductDTO addProduct(@RequestBody Product product) {
        return this.service.addProduct(product);
    }

    // Read all
    @GetMapping("/readAll")
    public List<ProductDTO> read() {
        return service.getAll();
    }


    //Update
    @PostMapping("/updateProduct/{barcode}")
    public String update(@PathVariable Integer barcode, @RequestBody Product product) {
        if (service.updateProduct(barcode, product)) {
            return "Product Updated";
        }
        return "Update Failed";
    }


    //Delete
    @DeleteMapping("/deleteProduct")
    public Boolean deleteProduct(@RequestBody int barcode) {
        return this.service.deleteByBarcode(barcode);
    }

}
