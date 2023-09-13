package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.repo.BrandRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BrandServiceTest {

    @Resource
    BrandRepository repository;

    @Test
    void createBrand() {
    }

    @Test
    void getBrandById() {
        Assertions.assertEquals("Akkodis Brand premium", repository.findById(1L).get().getName());
    }

    @Test
    void getAllBrand() {
        Assertions.assertEquals(3,repository.findAll().size());
    }

    @Test
    void deleteBrand() {
    }
}