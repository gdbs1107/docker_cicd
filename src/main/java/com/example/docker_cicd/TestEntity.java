package com.example.docker_cicd;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
