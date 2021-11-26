package com.vitta.SkateXut;

import com.vitta.SkateXut.model.Product;
import com.vitta.SkateXut.model.ProductRepository;
import com.vitta.SkateXut.service.ProductService;
import org.assertj.core.api.Assertions;
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
        Mockito.when(this.repo.save(ProductTestValues.urbanArttxStriker)).thenReturn(ProductTestValues.urbanArttxStrickerUnit);
        Assertions.assertThat(this.service.addProduct(ProductTestValues.urbanArttxStriker)).isTrue();
        Mockito.verify(this.repo, Mockito.times(1)).save(ProductTestValues.urbanArttxStriker);
    }

}
