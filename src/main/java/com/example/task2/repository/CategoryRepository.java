package com.example.task2.repository;

import com.example.task2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "category")
public interface CategoryRepository extends JpaRepository<Category , Integer> {

}
