package com.example.pizzaserver;

import com.example.pizzaserver.model.Pizza;
import org.springframework.data.repository.CrudRepository;

// дает возможность работать с данными
// CRUD - Create Read Update Delete
public interface PizzaDatas extends CrudRepository<Pizza, Integer> {
}
