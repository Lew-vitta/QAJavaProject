package com.vitta.SkateXut.controller;


import com.vitta.SkateXut.DTO.ProductDTO;
import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

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

    @PutMapping("/update")
    public ProductDTO updatePerson(@PathParam("id") Integer id, @RequestBody Product product) {
        return this.service.updateProduct(id, product);
    }


    @GetMapping("/test")
    public String test(){
        return "hiya";
    }
}
