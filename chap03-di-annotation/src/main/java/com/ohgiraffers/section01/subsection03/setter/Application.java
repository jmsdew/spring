package com.ohgiraffers.section01.subsection03.setter;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceSetter",BookService.class); // 해당 빈을 가져옴


        bookService.selectAllBooks().forEach(System.out::println);

        System.out.println(bookService.selectOneBook(1));
        System.out.println(bookService.selectOneBook(2));
    }
}
