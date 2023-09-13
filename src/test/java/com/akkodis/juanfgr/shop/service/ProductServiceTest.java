package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.repo.ProductRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServiceTest {

    @Resource
    ProductRepository repository;

    @Test
    void createProduct() {
    }

    @Test
    void getProductById() {
        Assertions.assertEquals("Akkodis Product premium A", repository.findById(35455L).get().getName());
    }

    @Test
    void getAllProduct() {
        Assertions.assertEquals(4, repository.findAll().size());
    }

    @Test
    void deleteProduct() {
    }
}