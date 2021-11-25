package com.vitta.SkateXut.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vitta.SkateXut.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findProductByProductName(String productName);
    @Query(value = "select * from products", nativeQuery = true)
    List<Product> findProductByBarcode(String barcode);


}
