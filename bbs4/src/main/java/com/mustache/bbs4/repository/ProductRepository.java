package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
