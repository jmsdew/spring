package com.ohgiraffers.section01.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceField")                // 비즈니스 로직이 수행됨
public class BookService {

    @Autowired     // 인터페이스의 클래스 구현체를 알아서 찾아서 매칭 1대1 대응만 가능하고 다대 1일 시에 primary를 찾아 매칭 (필드기반주입)
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook(){
        return bookDAO.selectBookList();
    }
    public BookDTO selectOneBook(int seq) {
        return bookDAO.selectOneBook(seq);
    }

}
