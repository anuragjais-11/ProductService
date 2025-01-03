package com.example.productservice.repos;

import com.example.productservice.models.Product;
import com.example.productservice.projections.ProductTitleAndDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("SELECT p.name as name, p.description as description FROM Product p WHERE p.id = :id")
    ProductTitleAndDescription getProductTitleAndDesc(@Param("id") Long id);
}
