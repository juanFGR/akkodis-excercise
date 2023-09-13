package com.akkodis.juanfgr.shop.controller;

import com.akkodis.juanfgr.shop.model.Product;
import com.akkodis.juanfgr.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping
    Product createProduct (@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping
    List<Product> getAllProduct (Product product){
        return productService.getAllProduct();
    }

    @GetMapping("{id}")
    Product searchProduct (@PathVariable("id") Long id){
        return productService.getProductById(id);
    }


}
