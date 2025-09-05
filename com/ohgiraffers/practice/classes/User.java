package com.ohgiraffers.practice.classes;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    // 기본 생성자 생성
    // Q1: 기본 생성자는 그러면 맨 먼저 정의한 메소드로 설정되는걸까?
    public User() {};

    // 매개 변수가 있는 생성자
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    // enrollDate까지 초기화하는 생성자
    public User(String id, String pwd, String name, java.util.Date enrollDate) {
        this(id, pwd, name);
        this.enrollDate = enrollDate;
    }

   public User(User otherUser) {
        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
   }

}
