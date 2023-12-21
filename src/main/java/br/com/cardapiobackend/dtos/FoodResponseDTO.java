package br.com.cardapiobackend.dtos;

import br.com.cardapiobackend.entities.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
    public FoodResponseDTO(Food food){
        this(food.getId(),
                food.getTitle(),
                food.getImage(),
                food.getPrice());
    }
}
