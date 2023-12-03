package com.ohgireaffers.study;

import com.ohgireaffers.common.Beverage;
import com.ohgireaffers.common.Bread;
import com.ohgireaffers.common.Product;
import com.ohgireaffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);


        Product carpBread = context.getBean("carpBread",Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

//        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart = context.getBean("cart", ShoppingCart.class);
        cart.addItem(carpBread);
        cart.addItem(milk);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(water);
        cart1.addItem(carpBread);

        System.out.println("cart : " + cart.getItems());
        System.out.println("cart1 : " + cart1.getItems());

        ((AnnotationConfigApplicationContext) context).close();


    }
}
