package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.model.Product;
import com.akkodis.juanfgr.shop.repo.ProductRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ProductServiceTest {

    @Resource
    ProductRepository repository;

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void createProduct() {
        Product product = new Product();
        product.setBrand(brandService.getBrandById(1L));
        product.setName("Test - Product");

        productService.createProduct(product);

        Assertions.assertEquals(5, productService.getAllProduct().size());
    }

    @Test
    void getProductById() {
        Assertions.assertEquals("Akkodis Product premium A", repository.findById(35455L).get().getName());
    }



    @Test
    void deleteProduct() {
    }
}