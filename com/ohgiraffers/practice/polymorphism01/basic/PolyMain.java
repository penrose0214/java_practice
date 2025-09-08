package com.ohgiraffers.practice.polymorphism01.basic;

public class PolyMain {
    public static void main(String[] args) {
        // parent instance 선언
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();

        parent.parentMethod();

        // children 선언
        System.out.println("Child -> Child");
        Child child = new Child();

        // chile class는 parent class로부터 상속했으므로 parentMethod 사용 가능
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.

        // 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

    }
}
