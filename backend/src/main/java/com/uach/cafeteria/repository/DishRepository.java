package com.uach.cafeteria.repository;

import com.uach.cafeteria.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
