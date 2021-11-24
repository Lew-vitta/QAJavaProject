package com.vitta.SkateXut.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitta.SkateXut.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findProductByProductName(String productName);

}
