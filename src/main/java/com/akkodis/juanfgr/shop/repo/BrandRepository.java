package com.akkodis.juanfgr.shop.repo;

import com.akkodis.juanfgr.shop.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {

}
