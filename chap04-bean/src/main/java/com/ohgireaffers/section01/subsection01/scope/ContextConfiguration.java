package com.ohgireaffers.section01.subsection01.scope;


import com.ohgireaffers.common.Beverage;
import com.ohgireaffers.common.Bread;
import com.ohgireaffers.common.Product;
import com.ohgireaffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("지리산암반수",3000,500);
    }

    @Bean
    @Scope("singleton")        // 스코프에 싱글톤을 써 주면 싱글톤 패턴
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
