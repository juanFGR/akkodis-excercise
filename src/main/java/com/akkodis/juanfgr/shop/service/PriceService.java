package com.akkodis.juanfgr.shop.service;

import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.model.Product;
import com.akkodis.juanfgr.shop.repo.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price createPrice(Price brand){
        return priceRepository.save(brand);
    }

    public Price getPriceById(Long id){
        Optional<Price> optionalBrand = priceRepository.findById(id);
        return optionalBrand.orElse(null);
    }

    public List<Price> getAllPrice(){
        return priceRepository.findAll();
    }

    public void deletePrice(Long id){
        priceRepository.deleteById(id);
    }


    public Price searchPriceByProduct(Product product, String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date a = sdf.parse(date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date target = sdf2.parse(sdf2.format(a));

        List<Price> prices = priceRepository.findByProductAndDate(product, new Date()).stream()
                .filter(price -> price.getStartDate().before(target) && price.getEndDate().after(target))
                .sorted((f1,f2) -> Long.compare(f2.getPriority(),f1.getPriority()))
                .collect(Collectors.toList());

        return prices.isEmpty() ? null: prices.get(0);
    }


}
