package com.ohgiraffers.practice.polymorphism01;

public class Main {
    public static void main(String[] args) {
        Tiger animal = new Tiger();
        animal.cry();   // 동적 바인딩에 의해서 animal이 호랑이가 울음소리를 낸다로 수정된다.
        //Animal animal2 = new Animal();
        //animal2.cry();
    }
}
