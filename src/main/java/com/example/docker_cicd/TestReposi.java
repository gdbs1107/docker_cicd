package com.example.docker_cicd;

import org.aspectj.weaver.ast.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestReposi extends JpaRepository<TestEntity, Long> {
}
