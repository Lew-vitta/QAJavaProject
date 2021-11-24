package com.vitta.SkateXut.service;

import com.vitta.SkateXut.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;

@Service
public class ProductServices {
    private Product product;

    public void addProduct(String product) {
        // Add new Person
        this.product.setProduct(product);
        // Return last added Person from List
    }
}
