package com.pherbst.ecommerce.dao;

import com.pherbst.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200") // accepts calls from web browser scripts for this origin
public interface ProductRepository extends JpaRepository<Product, Long> {
}
