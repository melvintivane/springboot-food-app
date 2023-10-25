package com.melvin.fullstackjavaapp.controller;

import com.melvin.fullstackjavaapp.food.Food;
import com.melvin.fullstackjavaapp.food.FoodRepository;
import com.melvin.fullstackjavaapp.food.FoodRequestDTO;
import com.melvin.fullstackjavaapp.food.FoodResponseDTO;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foods")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    // public FoodController(FoodRepository repository) {
    //     this.repository = repository;
    // }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PutMapping("/{id}")
    public void updateFood(@PathVariable Long id, @RequestBody FoodRequestDTO data) {
        Optional<Food> optionalFood = repository.findById(id);
        if (optionalFood.isPresent()) {
            Food existingFood = new Food(data);
            existingFood.setImage(data.image());
            existingFood.setTitle(data.title());
            existingFood.setPrice(data.price());
        } else {
            throw new EntityNotFoundException();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        repository.deleteById(id);
        return;
    }
}
