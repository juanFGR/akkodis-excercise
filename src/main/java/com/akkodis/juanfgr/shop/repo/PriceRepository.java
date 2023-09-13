package com.akkodis.juanfgr.shop.repo;

import com.akkodis.juanfgr.shop.model.Price;
import com.akkodis.juanfgr.shop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {
    @Query("SELECT t FROM Price t WHERE t.product = ?1")
    List<Price> findByProductAndDate(Product product, Date date);
}
//SELECT * FROM PRICE t WHERE t.product = 35455  AND t.end_date = '2020-12-31 23:59:59'