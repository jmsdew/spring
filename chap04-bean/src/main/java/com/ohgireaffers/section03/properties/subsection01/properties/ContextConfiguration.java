package com.ohgireaffers.section03.properties.subsection01.properties;

import com.ohgireaffers.common.Beverage;
import com.ohgireaffers.common.Bread;
import com.ohgireaffers.common.Product;
import com.ohgireaffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Date;

@Configuration
// resources 폴더 하위 경로를 기술한다. 폴더의 구분은 ( / ) 혹은 ( \ ) 로 한다.
@PropertySource("section03/properties/subsection01/properties/product-info.properties")
public class ContextConfiguration {


    /*
    * 치환자(placeholder) 문법을 이용하여 properties 에 저장된 key를 입력하면 value 에 해당하는 값을 꺼내온다.
    * 공백을 사용하면 값을 읽어오지 못하니 주의한다.
    * : 을 사용하면 값을 읽어오지 못하는 경우 사용할 대체 값을 작성할 수 있다.
    *
    * */

    @Value("${bread.carpbread.name:팥붕어빵}")                           // 리소스에 있는 값을 가져올 때 씀
    private String carpBreadName;

    @Value("${bread.carpbread.price:0}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name:}")
    private String milkName;

    @Value("${beverage.milk.price:0}")
    private int milkPrice;

    @Value("${beverage.milk.capacity:0}")
    private int milkCapacity;

    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName, carpBreadPrice, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage(milkName,milkPrice,milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name:}")String waterName,
                         @Value("${beverage.water.price:0}")int waterPrice,
                         @Value("${beverage.water.capacity:0}")int waterCapacity
                         ){
        return new Beverage(waterName,waterPrice,waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

}
