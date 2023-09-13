package com.akkodis.juanfgr.shop.service;


import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.repo.PriceRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Optional;

@SpringBootTest
class PriceServiceTest {

    @Resource
    PriceRepository priceRepository;
    @Autowired
    PriceService priceService;
    @Autowired
    ProductService productService;


    @Mock
    Optional<Price> price;

    @BeforeEach
    void setMockOutput() {

    }


    @Test
    void getAllPrice() {
        Assertions.assertNotNull(priceRepository.findAll());
        Assertions.assertEquals(4,priceRepository.findAll().size());
    }

    @Test
    void testCase_1() throws ParseException {
        /**
         * This a test to validate the akkodis test:
         * Price application disambiguator. If two rates coincide in a range of dates, the one with the
         * highest priority (highest numerical value) is applied.
         *
         * */
        Price priceExpected = priceService.getPriceById(2L);
        Price priceCalculated = priceService.searchPriceByProduct(productService.getProductById(35455L), "2020-06-14-18.29.00");

        Assertions.assertEquals(priceExpected.getId(),priceCalculated.getId());
        Assertions.assertEquals(priceExpected.getCost(),priceCalculated.getCost());
        Assertions.assertEquals(priceExpected.getCurrent(),priceCalculated.getCurrent());
        Assertions.assertEquals(priceExpected.getProduct().getName(),priceCalculated.getProduct().getName());
    }

    @Test
    void testCase_2() throws ParseException {
        /**
         * This a test to validate the akkodis test:
         * Price application disambiguator. If two rates coincide in a range of dates, the one with the
         * highest priority (highest numerical value) is applied.
         *
         * */
        Price priceExpected = priceService.getPriceById(1L);
        Price priceCalculated = priceService.searchPriceByProduct(productService.getProductById(35455L), "2020-06-14-18.31.00");

        Assertions.assertEquals(priceExpected.getId(),priceCalculated.getId());
        Assertions.assertEquals(priceExpected.getCost(),priceCalculated.getCost());
        Assertions.assertEquals(priceExpected.getCurrent(),priceCalculated.getCurrent());
        Assertions.assertEquals(priceExpected.getProduct().getName(),priceCalculated.getProduct().getName());

    }




}