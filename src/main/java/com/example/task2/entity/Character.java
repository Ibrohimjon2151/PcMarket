package com.example.task2.entity;

import com.example.task2.entity.template.AbcNameEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Character extends AbcNameEntity {

}
