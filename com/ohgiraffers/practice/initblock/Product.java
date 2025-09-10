package com.ohgiraffers.practice.initblock;

public class Product {
    private String name = "갤럭시";
    private int price = 100000;
    private static String brand = "삼송";

    // 초기화 블럭
    {
        price = 80000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작");
    }

    // static 초기화 블럭
    static{
        brand = "헬지";
        System.out.println("static 블럭 동작");
    }


    public String getInformation(){
        return this.name + " " + this.price + " " + Product.brand;
    }

}

