package com.vitta.SkateXut;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitta.SkateXut.model.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.concurrent.ExecutionException;

@Sql(scripts = {"classpath:data.sql"})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@ActiveProfiles(profiles = "test")
public class ProductControllerTest {

    @Autowired
    private ProductRepository repo;

    @Autowired
    private ObjectMapper jsony;

    @Autowired
    private MockMvc mock;

    @Test
    void testAddProduct() throws  Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.POST, "/addProduct");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.content(this.jsony.writeValueAsString(ProductTestValues.toyMachineMonster));
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isCreated();
        ResultMatcher content = MockMvcResultMatchers.content().string("New Product Added");

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
    }

//    @Test
//    void testReadAll() throws Exception{
//        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
//                .request(HttpMethod.GET, "/readAll");
//        mockRequest.contentType(MediaType.APPLICATION_JSON);
//        mockRequest.accept(MediaType.APPLICATION_JSON);
//
//        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
//        ResultMatcher content = MockMvcResultMatchers.content()
//                .json(this.jsony.writeValueAsString(ProductTestValues.allProductsDTO));
//
//        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
//
//    }
//
//    @Test
//    void testReadByBarcode() throws Exception{
//        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
//                .request(HttpMethod.GET, "/readByBarcode");
//        mockRequest.contentType(MediaType.APPLICATION_JSON);
//        mockRequest.content(this.jsony.writeValueAsString(ProductTestValues.ToyMachineMonster.getBarcode()));
//        mockRequest.accept(MediaType.APPLICATION_JSON);
//
//        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
//
//
//        ResultMatcher content = MockMvcResultMatchers.content()
//                .json(this.jsony.writeValueAsString((ProductTestValues.ToyMachineMonsterDTO)));
//        this.mock.perform(mockRequest).andExpect(status).andExpect(content);
//
//    }


    @Test
    void testReadByName() throws Exception{
        MockHttpServletRequestBuilder mockRequest = MockMvcRequestBuilders
                .request(HttpMethod.GET, "/readByName");
        mockRequest.contentType(MediaType.APPLICATION_JSON);
        mockRequest.content(this.jsony.writeValueAsString(ProductTestValues.almostPlacesR7.getProductName()));
        mockRequest.accept(MediaType.APPLICATION_JSON);

        ResultMatcher status = MockMvcResultMatchers.status().isAccepted();
        ResultMatcher content = MockMvcResultMatchers.content()
                .json(this.jsony.writeValueAsString(ProductTestValues.almostPlacesR7List));

        this.mock.perform(mockRequest).andExpect(status).andExpect(content);

    }

/*
  @GetMapping("/readByName")
    public ResponseEntity<List<ProductDTO>> readByName(@RequestBody String name) {
        return new ResponseEntity<>(service.getProductByName(name), HttpStatus.ACCEPTED);
    }


 */




}
