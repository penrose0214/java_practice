package com.ohgiraffers.practice.polymorphism01.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 업캐스팅, child 인스턴스가 부모 클래스의 메소드를 참조할 수 있음
        Parent parent1 = (Parent) child;

        // 업캐스팅 생략 예시
        Parent parent2 = child;

        // 둘다 동일한 출력을 가지는 것을 확인할 수 있다.
        // 즉, 업캐스팅은 명시를 생략하는 것이 가능하다.
        parent1.parentMethod();
        parent2.parentMethod();
    }
}
