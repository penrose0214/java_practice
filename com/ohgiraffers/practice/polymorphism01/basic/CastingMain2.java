package com.ohgiraffers.practice.polymorphism01.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변소가 자식 instance를 참조, 다형적 참조
        Parent poly = new Child();

        // 컴파일 에러
        // 부모 인스턴스는 자식 클래스의 메소드를 사용할 수 없음
        // poly.childMethod();

        // 일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

        // 위의 다운 캐스팅은 일시적인 다운 캐스팅이므로 다운 캐스팅 없이는 여전히 부모 인스턴스가 자식 클래스의 메소드를 사용할 수 없는 것을 확인할 수 있음
        // poly.childMethod();
    }
}
