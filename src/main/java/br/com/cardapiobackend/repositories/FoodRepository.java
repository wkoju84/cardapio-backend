package br.com.cardapiobackend.repositories;

import br.com.cardapiobackend.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
