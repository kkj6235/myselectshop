package com.sparta.myselectshop.naver.repository;

import com.sparta.myselectshop.naver.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Boolean existsByTitle(String title);
}
