package com.vitta.SkateXut.service;

import com.vitta.SkateXut.DTO.ProductDTO;
import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.model.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ModelMapper mapper;
    private ProductRepository repo;

    public ProductService(ProductRepository repo, ModelMapper mapper){
        super();
        this.repo = repo;
        this.mapper = mapper;
    }

    private ProductDTO mapToDTO(Product Product) {
        return this.mapper.map(Product, ProductDTO.class);
    }

    public ProductDTO addProduct(Product product) {
        // Add new Person
        Product saved = this.repo.save(product);
        return this.mapToDTO(saved);
        // Return last added Person from List
    }

    public ProductDTO updateProduct(Integer barcode, Product newProduct){

        Optional<Product> existingOptional = this.repo.findById(barcode);
        Product existing = existingOptional.get();

        existing.setProductName(newProduct.getProductName());
        existing.setBarcode(newProduct.getBarcode());
        existing.setDescription(newProduct.getDescription());
        existing.setColour(newProduct.getColour());
        existing.setDimentions(newProduct.getDimentions());
        existing.setMaterials(newProduct.getMaterials());
        existing.setStock(newProduct.getStock());

        Product updated = this.repo.save(existing);
        return  this.mapToDTO(updated);
    }


}
