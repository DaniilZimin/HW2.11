package ru.dzimin.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.dzimin.spring.service.BasketService;

import java.util.List;

@RestController
@RequestMapping("order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("add")
    public void add(@RequestParam("productIds") Integer[] productIds){
        basketService.addBasket(productIds);
    }

    @GetMapping("get")
    public List<Integer> productIds(){
        return basketService.getBasket();
    }
}
