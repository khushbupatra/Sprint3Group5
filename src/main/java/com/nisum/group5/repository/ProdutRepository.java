package com.nisum.group5.repository;

import com.nisum.group5.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutRepository extends JpaRepository<Product, Integer>{

}
