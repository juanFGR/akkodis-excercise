package com.akkodis.juanfgr.shop.controller;


import com.akkodis.juanfgr.shop.service.BrandService;
import com.akkodis.juanfgr.shop.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brand")
public class BrandController {

    @Autowired
    BrandService brandService;


    @PostMapping
    Brand createBrand (@RequestBody Brand brand){
        return brandService.createBrand(brand);
    }

    @GetMapping
    List<Brand> getAllBrand (Brand brand){
        return brandService.getAllBrand();
    }

    @GetMapping("{id}")
    Brand searchBrand (@PathVariable("id") Long id){
        return brandService.getBrandById(id);
    }



}
