package com.vitta.SkateXut;

import com.vitta.SkateXut.model.ProductRepository;
import com.vitta.SkateXut.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ProductServiceUnitTest {

    @MockBean
    private ProductRepository repo;

    @Autowired
    private ProductService service;

    @Test
    void testCreate(){
        Mockito.when(this.repo.save(ProductTestValues.urbanArttxStriker)).thenReturn(ProductTestValues.urbanArttxStriker);
        Assertions.assertTrue(this.service.addProduct(ProductTestValues.urbanArttxStriker));
        Mockito.verify(this.repo, Mockito.times(1)).save(ProductTestValues.urbanArttxStriker);
    }

    @Test
    void readByBarcode(){
        final Integer barcode = ProductTestValues.urbanArttxStriker.getBarcode();
        Mockito.when(this.repo.findById(barcode)).thenReturn(Optional.of(ProductTestValues.urbanArttxStriker));
        Assertions.assertEquals(this.service.getProductByBarcode(barcode),ProductTestValues.urbanArttxStriker);
        Mockito.verify(this.repo, Mockito.times(1)).findAll();
    }




}
