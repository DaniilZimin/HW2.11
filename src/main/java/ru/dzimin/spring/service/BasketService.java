package ru.dzimin.spring.service;

import org.springframework.stereotype.Service;
import ru.dzimin.spring.model.Basket;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BasketService {
    @Resource(name = "basket")
    private Basket basket;

    public void addBasket(Integer... productIds){
        basket.add(productIds);
    }

    public List<Integer> getBasket(){
        return basket.getAll();
    }
}
