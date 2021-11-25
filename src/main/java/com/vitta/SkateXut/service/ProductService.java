package com.vitta.SkateXut.service;

import com.vitta.SkateXut.DTO.ProductDTO;
import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.model.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ModelMapper mapper;
    private final ProductRepository repo;

    public ProductService(ProductRepository repo, ModelMapper mapper){
        super();
        this.repo = repo;
        this.mapper = mapper;
    }

    private ProductDTO mapToDTO(Product Product) {
        return this.mapper.map(Product, ProductDTO.class);
    }

    //create
    public boolean addProduct(Product product) {
        // Add new Person
        try{repo.save(product);}catch (Exception e){
            throw new IllegalArgumentException();
        }
        ;
        return true;
        // Return last added Person from List
    }

    //read
    public List<ProductDTO> getAll(){
        return this.repo.findAll()
                .stream().map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> getProductByBarcode(int barcode){
        return this.repo.findById(barcode)
                .stream().map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> getProductByName(String name){
        return this.repo.findProductByProductName(name)
                .stream().map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    //update
    public boolean updateProduct(int barcode, Product updated) {
        if(deleteByBarcode(barcode)) {
            addProduct(updated);
            return repo.existsById(updated.getBarcode());
        }

        return false;
    }

    //delete
    public Boolean deleteByBarcode(Integer barcode) {
        if (this.repo.existsById(barcode)) {
            this.repo.deleteById(barcode);
        } else {
            throw new EntityNotFoundException();
        }
        return !this.repo.existsById(barcode);
    }

}
