package com.akkodis.juanfgr.shop.controller;

import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.service.PriceService;
import com.akkodis.juanfgr.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("api/price")
public class PriceController {

    @Autowired
    PriceService priceService;
    @Autowired
    ProductService productService;


    @PostMapping
    Price createPrice (@RequestBody Price price){
        return priceService.createPrice(price);
    }

    @GetMapping
    List<Price> getAllPrice (Price price){
        return priceService.getAllPrice();
    }

    @GetMapping("{id}")
    Price searchPrice (@PathVariable("id") Long id){
        return priceService.getPriceById(id);
    }

    @GetMapping("/product/{id}")
    Price searchPriceByProduct (@PathVariable("id") Long id,
                                      @RequestParam("date") String date) throws ParseException {

        return priceService.searchPriceByProduct(productService.getProductById(id), date);
    }


}
