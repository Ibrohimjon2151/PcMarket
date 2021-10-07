package com.example.task2.repository;

import com.example.task2.entity.Category;
import com.example.task2.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "type")
public interface TypeRepository extends JpaRepository<Type, Integer> {

}
