package dev.java10x.Fridge.service;

import org.springframework.stereotype.Service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repositore.FoodRepositore;

import java.util.List; 

@Service
public class FoodService {
    
    private final FoodRepositore foodRepositore;

    public FoodService(FoodRepositore foodRepositore){
        this.foodRepositore = foodRepositore;
    }
//Listar
    public List<Food> getAll(){ return foodRepositore.findAll();}
//Criar
public Food save(Food food){return foodRepositore.save(food);}
//Deletar
public void delete(Long id){foodRepositore.deleteById(id);}

}
