package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.model.Brand;
import com.akkodis.juanfgr.shop.repo.BrandRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BrandServiceTest {

    @Resource
    BrandRepository repository;
    @Autowired
    BrandService brandService;

    @Test
    void createBrand() {
        Brand brand = new Brand();
        brand.setName("Test - BRAND");
        brandService.createBrand(brand);

        Assertions.assertEquals(brand.getName(), brandService.getBrandById(4L).getName());
        Assertions.assertEquals(4,repository.findAll().size());

    }

    @Test
    void getBrandById() {
        Assertions.assertEquals("Akkodis Brand premium", repository.findById(1L).get().getName());
    }



    @Test
    void deleteBrand() {
    }
}