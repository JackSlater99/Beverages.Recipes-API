package com.example.beveragesrecipes.repositories;

import com.example.beveragesrecipes.models.Instructions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructionRepository extends JpaRepository<Instructions, Long> {
}
