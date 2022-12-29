package com.example.pizzaserver.controller;

import com.example.pizzaserver.PizzaDatas;
import com.example.pizzaserver.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    PizzaDatas datas;

    @GetMapping("/add")
    public @ResponseBody String add(@RequestParam String name,
                                    @RequestParam Integer size) {
        Pizza pizza = new Pizza(name, size);
        datas.save(pizza);
        return "Saved!";
    }

    @GetMapping("/list")
    public @ResponseBody Iterable<Pizza> getAll() {
        return datas.findAll();
    }
}
