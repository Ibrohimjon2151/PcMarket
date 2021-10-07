package com.example.task2.repository;

import com.example.task2.entity.Category;
import com.example.task2.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "position")
public interface PositionRepository extends JpaRepository<Position, Integer> {

}
