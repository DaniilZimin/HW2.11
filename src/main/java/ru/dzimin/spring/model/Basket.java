package ru.dzimin.spring.model;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> basket = new ArrayList<>();

    public void add(Integer... productIds) {
        if (productIds == null){
            return;
        }
        basket.addAll(List.of(productIds));
    }

    public List<Integer> getAll() {
        return basket;
    }
}
