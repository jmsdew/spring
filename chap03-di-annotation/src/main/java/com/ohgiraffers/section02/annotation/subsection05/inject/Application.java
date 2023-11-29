package com.ohgiraffers.section02.annotation.subsection05.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();

        for (String bean:beanNames) {
            System.out.println(bean);
        }

        PokemonService pokemonService = context.getBean("pokemonServiceInject", PokemonService.class);   // 프라이머리가 없으면 동일한 타입이 많기 때문에 에러

        pokemonService.pokemonAttack();


    }
}
