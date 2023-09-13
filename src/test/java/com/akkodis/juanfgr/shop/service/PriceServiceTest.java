package com.akkodis.juanfgr.shop.service;


import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.model.Product;
import com.akkodis.juanfgr.shop.repo.PriceRepository;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Date;

@SpringBootTest
class PriceServiceTest {

    @Resource
    PriceRepository priceRepository;
    @Autowired
    PriceService priceService;
    @Autowired
    ProductService productService;

    @Test
    void createPrice() {
        Product product = productService.getProductById(35455L);
        Price price = new Price();
        price.setCost(36L);
        price.setCurrent("EUR");
        price.setProduct(product);
        price.setStartDate(new Date());
        price.setEndDate(new Date());

        priceService.createPrice(price);

        Assertions.assertNotNull(priceRepository.findAll());
        Assertions.assertEquals(5, priceService.getAllPrice().size());


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