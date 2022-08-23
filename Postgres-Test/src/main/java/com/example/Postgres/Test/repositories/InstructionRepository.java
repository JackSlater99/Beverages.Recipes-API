package com.example.Postgres.Test.repositories;

import com.example.Postgres.Test.models.Instructions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instructions, Long> {
}
