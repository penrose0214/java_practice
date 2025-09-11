package com.ohgiraffers.level02.normal.book.run;

import com.ohgiraffers.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        // 기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookInit0 = new BookDTO();
        System.out.println(bookInit0.getTitle());
        System.out.println(bookInit0.getAuthor());
        System.out.println(bookInit0.getPublisher());
        System.out.println(bookInit0.getPrice());
        System.out.println(bookInit0.getdiscountRate());

        // 필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookInit1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        System.out.println(bookInit1.getTitle());
        System.out.println(bookInit1.getAuthor());
        System.out.println(bookInit1.getPublisher());
        System.out.println(bookInit1.getPrice());
        System.out.println(bookInit1.getdiscountRate());

        // 모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookInit2 = new BookDTO("홍길동전", "활빈당", "허균", 500000, 0.5);
        System.out.println(bookInit2.getTitle());
        System.out.println(bookInit2.getAuthor());
        System.out.println(bookInit2.getPublisher());
        System.out.println(bookInit2.getPrice());
        System.out.println(bookInit2.getdiscountRate());


    }
}
