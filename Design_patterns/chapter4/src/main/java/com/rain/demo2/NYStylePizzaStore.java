package com.rain.demo2;

import com.rain.demo1.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else{
            return null;
        }
    }
}
