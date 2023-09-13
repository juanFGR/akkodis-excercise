package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.model.Brand;
import com.akkodis.juanfgr.shop.repo.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Brand createBrand(Brand brand){
        return brandRepository.save(brand);
    }

    public Brand getBrandById(Long id){
        Optional<Brand> optionalBrand = brandRepository.findById(id);
        return optionalBrand.orElse(null);
    }

    public List<Brand> getAllBrand(){
        return brandRepository.findAll();
    }

    public void deleteBrand(Long id){
        brandRepository.deleteById(id);
    }


}
