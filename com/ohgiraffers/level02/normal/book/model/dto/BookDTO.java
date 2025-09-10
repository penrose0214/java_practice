package com.ohgiraffers.level02.normal.book.model.dto;

public class BookDTO {
    String title;
    String publisher;
    String author;
    int price;
    double discountRate;

    public BookDTO() {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
    }

    // Constructor
    // 기본 생성자, 필드 3가지를 초기화하는 생성자, 모든 필드를 초기화 하는 생성자 작성
    public BookDTO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    // setters
    // 필드 수정용 메소드
    public void setTitle(String inputTitle){
        this.title = inputTitle;
    }

    public void setPublisher(String inputPublisher){
        this.publisher = inputPublisher;
    }

    public void setAuthor(String inputAuthor){
        this.author = inputAuthor;
    }

    public void setPrice(int inputPrice){
        this.price = inputPrice;
    }

    public void setDiscountRate(double inputDiscountRate){
        this.discountRate = inputDiscountRate;
    }

    // getters
    // 필드값 리턴용 메소드
    public String getTitle(){
        return this.title;
    }

    // 필드값 출력용 메소드
    public String getAuthor (){
        return this.author;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public int getPrice(){
        return this.price;
    }

    public double getdiscountRate(){
        return this.discountRate;
    }

}
