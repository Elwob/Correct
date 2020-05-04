package com.company.controller;

import com.company.database.models.Ingredient;
import com.company.database.repositories.IngredientRepository;

public class ControllerIngredient {
 private    IngredientRepository ingredientRepository;

    public ControllerIngredient() {
        this.ingredientRepository = new IngredientRepository();
    }

    public void create(Ingredient entity) {

        this.ingredientRepository.create(entity);
        System.out.println(this.ingredientRepository.read());

    }

    public void read() {
        this.ingredientRepository.read();
        System.out.println(this.ingredientRepository.read());
    }

    public void delete(int id) {

        ingredientRepository.delete(id);
        System.out.println(this.ingredientRepository.read());
    }
}
