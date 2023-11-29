package com.ohgiraffers.section01.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = (BookService) context.getBean(BookService.class);

        bookService.selectAllBooks().forEach(book -> System.out.println(book));
        System.out.println("----------------------------람다 표현식 위 아래 같음-------------------------------------");
        bookService.selectAllBooks().forEach(System.out::println);

        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));
    }
}
