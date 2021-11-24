package com.vitta.SkateXut.controller;


import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.service.ProductServices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private final ProductServices service;

    public ProductController(ProductServices service){
        super();
        this.service = service;
    }

    // Create Product
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody String product) {
        return "true";
    }


    @GetMapping("/test")
    public String test(){
        return "hiya";
    }
}
