package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.model.Product;
import com.akkodis.juanfgr.shop.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product brand){
        return productRepository.save(brand);
    }

    public Product getProductById(Long id){
        Optional<Product> optionalBrand = productRepository.findById(id);
        return optionalBrand.orElse(null);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }


}
