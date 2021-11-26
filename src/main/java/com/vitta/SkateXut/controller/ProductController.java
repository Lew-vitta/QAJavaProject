package com.vitta.SkateXut.controller;

import com.vitta.SkateXut.DTO.ProductDTO;
import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        this.service.addProduct(product);
        return new ResponseEntity<>("New Product Added", HttpStatus.CREATED);
    }

    // Read all
    @GetMapping("/readAll")
    public ResponseEntity<List<ProductDTO>> read() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/readByBarcode/{barcode}")
    public ResponseEntity<ProductDTO>readByBarcode(@PathVariable int barcode) {
        return new ResponseEntity<>(service.getProductByBarcode(barcode), HttpStatus.ACCEPTED);
    }

    @GetMapping("/readByName/{name}")
    public ResponseEntity<ProductDTO> readByName(@PathVariable String name) {
        return new ResponseEntity<>(service.getProductByName(name), HttpStatus.ACCEPTED);
    }

    //Update
    @PostMapping("/updateProduct/{barcode}")
    public ResponseEntity<String> update(@PathVariable Integer barcode, @RequestBody Product product) {
            return new ResponseEntity<>(barcode +" Updated", HttpStatus.ACCEPTED);
    }


    //Delete
    @DeleteMapping("/deleteProduct/{barcode}")
    public ResponseEntity<String> deleteProduct(@PathVariable int barcode) {
        return new ResponseEntity<>(barcode +" Deleted", HttpStatus.ACCEPTED);
    }

}
