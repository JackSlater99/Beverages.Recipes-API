package com.example.Postgres.Test.controllers;

import com.example.Postgres.Test.models.Instructions;
import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.RecipeIngredient;
import com.example.Postgres.Test.repositories.InstructionRepository;
import com.example.Postgres.Test.repositories.RecipeIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructionsController {

    @Autowired
    InstructionRepository instructionRepository;

    @GetMapping("/instructions")
    public ResponseEntity<List<Instructions>> getAllInstructions() {
        return new ResponseEntity<>(instructionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/instructions/{id}")
    public ResponseEntity<Instructions> getInstruction(@PathVariable Long id) {
        return new ResponseEntity(instructionRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/instructions")
    public ResponseEntity<Instructions> postInstructions(@RequestBody Instructions instruction){
        instructionRepository.save(instruction);
        return new ResponseEntity<>(instruction, HttpStatus.CREATED);
    }

    @PutMapping(value="/instructions/{id}")
    public ResponseEntity<Instructions> putInstructions(@RequestBody Instructions instructions, @PathVariable Long id){
        Instructions InstructionsToUpdate = instructionRepository.findById(id).get();
        InstructionsToUpdate.setInstruction(instructions.getInstruction());
        instructionRepository.save(InstructionsToUpdate);
        return new ResponseEntity<>(InstructionsToUpdate, HttpStatus.OK);
    }

    @DeleteMapping(value="/instructions/{id}")
    public ResponseEntity<Long> deleteInstruction(@PathVariable Long id){
        instructionRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
