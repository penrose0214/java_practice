package com.ohgiraffers.practice.polymorphism01.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();   // 문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 컴파일 오류는 나지 않지만, 런타임 오류 발생
        child2.childMethod();   // 실행 불가
    }
}
