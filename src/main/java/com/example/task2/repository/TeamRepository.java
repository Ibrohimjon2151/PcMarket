package com.example.task2.repository;

import com.example.task2.entity.Category;
import com.example.task2.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list" , path = "team")
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
