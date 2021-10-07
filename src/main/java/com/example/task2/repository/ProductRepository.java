package com.example.task2.repository;

import com.example.task2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
