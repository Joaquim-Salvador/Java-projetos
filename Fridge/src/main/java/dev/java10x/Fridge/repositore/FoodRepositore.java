package dev.java10x.Fridge.repositore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dev.java10x.Fridge.model.Food;

public interface FoodRepositore extends JpaRepository<Food, Long>{
    
}
