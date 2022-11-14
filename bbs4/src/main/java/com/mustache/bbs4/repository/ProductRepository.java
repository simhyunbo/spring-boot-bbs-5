package com.mustache.bbs4.repository;

import com.mustache.bbs4.domain.Hospital;
import com.mustache.bbs4.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
