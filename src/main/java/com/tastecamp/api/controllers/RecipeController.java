package com.tastecamp.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @GetMapping  
    public String getRecipes(){
        return "Varias receitinhas";
    }

    @GetMapping("/{id}")  
    public String getRecipesById(@PathVariable Long id){
        return "Varias receitinhas, mas a sua e:" + id;
    }

    @PostMapping
    public String createRecipe(@RequestBody String body) {
        return body;
    }

    @PutMapping("/{id}")
    public String putRecipe(@PathVariable Long id, @RequestBody String body) {
        return body+id;
    }
    
    @DeleteMapping("/{id}")
    public String deleteRecipe(@PathVariable Long id) {
        return "Deletando o item" + id;
    }
}
